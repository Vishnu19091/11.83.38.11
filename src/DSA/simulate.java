package DSA;

public class simulate {
    public static void findFirstAndLastPos(int[] arr, int target){
        int firstPos = -1;
        int lastPos = -1;

        int n = arr.length;

        int i =0;
        for(; i < n; i++){
            if(arr[i] == target){
                firstPos = i + 1;
                break;
            }
        }

        for(; i < n; i++){
            if(arr[i] == target){
                lastPos = i + 1;
            }
        }

        System.out.println("First Pos: " + firstPos);
        System.out.println("Last Pos: " + lastPos);
    }


    public static void main(String[] args) {
        findFirstAndLastPos(new int[] {101, 122, 143, 122, 134, 151, 101, 122}, 122);
    }
}
