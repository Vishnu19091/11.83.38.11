package DSA.Arrays.prblm_qn;

public class RotateArrays{
  /**
   * For the rotateOne & rotate method
   * the time complexity is O(k*n) because performing k rotation
   *
   * Calling the rotateOne Method inside the rotate Method
   */

  static void rotateOne(int[] arr){
    int n = arr.length;

    // store the first index element
    int tmp = arr[0];

    // iterate the array from 1st index
    // and shift the array elements to left
    for (int i = 1; i < n; i++){
      arr[i-1] = arr[i];
    }
    // after shifting the elements update the last element with the first one
    arr[n - 1] = tmp;
  }

  public static void rotate(int[] arr, int k){
    int n = arr.length;
    // the use of 'k' is to get the no.of rotation to be done
    // using the remainder we will rotate the array
    k = k % n;

    if(k < 0){
      k = k+n;
    }

    // on each iteration function call is made
    for (int i = 0; i < k; i++){
      rotateOne(arr);
    }
  }

  static void rotateArray(int[] arr, int k){
    int n = arr.length;
    
    // to get no.of loop iteration required to rotate array
    k %= n;

    // reverse the whole array
    reverse(arr, 0, n - 1);

    // reverse the first k elements
    reverse(arr, 0, k - 1);

    // reverse the remaining elements
    reverse(arr, k, n - 1);
  }

  public static void reverse(int[] arr, int start, int end){
    while(start < end){
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
  }
  
  public static void traverseArray(int[] arr){
    System.out.print("{");
    for (int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + ", ");
    }
    System.out.println("}");
  }
  public static void main(String[] args){
    RotateArrays obj = new RotateArrays();

    int[] arr = {1,2,3,4,5};

    // rotateOne(arr);
    rotateArray(arr, 3);
    traverseArray(arr);
  }
}
