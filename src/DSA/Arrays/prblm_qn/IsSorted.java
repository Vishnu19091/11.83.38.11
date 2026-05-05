package DSA.Arrays.prblm_qn;

public class IsSorted{
  public static boolean isSorted(int[] arr){
    int n = arr.length;
    for(int i = 1; i<n;i++){
      if (arr[i] > arr[i-1]){
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7};

    boolean r = isSorted(arr);
//    traverseArray(arr);
//    reverse(arr,0,4);
//    traverseArray(arr);
    System.out.println(r);
  }
}
