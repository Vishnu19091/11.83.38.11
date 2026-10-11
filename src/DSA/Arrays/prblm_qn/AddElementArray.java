package DSA.Arrays.prblm_qn;

import DSA.Arrays.PracticeArray;
class InsertionAtArray{
    public static int[] addFront(int[] arr, int value){
        int[] newResult = new int[arr.length + 1];

        newResult[0] = value;

        for(int i = 0; i < arr.length; i++){
            // adding array elements to newArray
            newResult[i+1] = arr[i];
        }

        return newResult;
    }

    public static int[] addEnd(int[] arr, int value){
        int[] newArray = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++){
            newArray[i] = arr[i];
        }
        newArray[newArray.length -1 ] = value;

        return newArray;
    }

    public static int[] addAt(int[] arr, int value, int pos){
        int[] newArray = new int[arr.length + 1];
        int i = 0;
        for(; i < pos; i++){
            newArray[i] = arr[i];
        }
        newArray[i] = value;
        for(; i < arr.length; i++){
            newArray[i+1] = arr[i];
        }

        return newArray;
    }
}

public class AddElementArray {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6};
        int[] newArray = InsertionAtArray.addAt(array, 0, 3);
        PracticeArray.traverse(newArray);
    }
}
