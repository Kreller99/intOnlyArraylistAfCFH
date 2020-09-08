import java.util.Arrays;

public class IntOnlyArrayList {
    int[] intList = {6,66,666};

    public IntOnlyArrayList() {
    }

    public int get(int index){
        System.out.println(intList[index]);
        return -1;
    }
    public void add(int value){

        int count = intList.length;
        int newList[] = new int[count + 1];
        for(int i = 0; i<count; i++){
            newList[i] = intList[i];
        }

        newList[count] = value;

        intList = newList;
        try{
            int position = 0;
            for(int elem : intList){
                System.out.print(intList[position] + " ");
                position = position + 1;
            }
        }
        catch(ArrayIndexOutOfBoundsException a){
        }


    }
    public void remove(int index){
        System.out.println(Arrays.toString(intList));
        int[] intListNew = new int[intList.length - 1];
        for(int i = 0,k = 0; i < intList.length; i++){
            if(intList[i] == index){
                continue;
            }
            intListNew[k++] = intList[i];
        }
        intList = intListNew;
        System.out.println(Arrays.toString(intListNew));

    }
    public void size(){
        System.out.println("");
        System.out.println(intList.length);

    }

}
