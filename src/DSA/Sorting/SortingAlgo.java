package DSA.Sorting;
import DSA.Arrays.PracticeArray;
import java.util.ArrayList;
import java.util.Arrays;

public class SortingAlgo {
  public static void swap(int a, int b){
    int temp = a;
    a = b;
    b = a;
  }

    public static void bubbleSort(int[] arr){
      int n = arr.length;
      int comp = 0;
      int swaps = 0;

      for(int i = 0; i <= n-2; i++){
        for(int j = 0; j <= n-2-i; j++){
          comp++;
          if(arr[j] > arr[j+1]){
            int temp = arr[j+1];
            arr[j+1] = arr[j];
            arr[j] = temp;
            swaps++;
          }
        }
      }

      System.out.print(Arrays.toString(arr));
      System.out.println("Compares: " + comp + ", Swaps: " + swaps);
    }

    public static void selectionSort(int[] arr){
      int n = arr.length;

      for(int i = 0; i <= n-2; i++){
        int min = i;

        for(int j = i; j < n; j++){
          if(arr[j] < arr[min]){
            int temp = arr[min];
            arr[min] = arr[j];
            arr[j] = temp;
          }
        }
      }

      System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
      int n = arr.length;
      int j = 0;
      for(int i = 0; i < n; i++){
        j = i;

        while(j > 0 && arr[j-1] > arr[j]){
          int temp = arr[j - 1];
          arr[j-1] = arr[j];
          arr[j] = temp;
//          System.out.println("Runs");
          j--;
        }
      }
    }

    public static void merge(int[] arr, int low, int mid, int high){
      ArrayList<Integer> temp= new ArrayList<>();

      int left = low;
      int right = mid + 1;

      // merge both sorted parts
      while(left <= mid && right <= high){
        if(arr[left] <= arr[right]) temp.add(arr[left++]);
        else temp.add(arr[right++]);
      }

      // adds remaining left elements
      while(left<=mid){
        temp.add(arr[left++]);
      }
      
      // adds remaining right elements
      while(right <= high){
        temp.add(arr[right++]);
      }

      for(int i = low; i <= high; i++){
        arr[i] = temp.get(i - low);
      }
    }

    public static void mergeSort(int[] arr, int low, int high){
      if(low >= high){
        return;
      }

      int mid = (low+high)/2;

      mergeSort(arr, low, mid);
      mergeSort(arr, mid+1, high);
      merge(arr, low, mid, high);
    }

    public static void main(String[] args){
      int[] arr = {3,1,2};
//      bubbleSort(arr);
      selectionSort(arr);
      //insertionSort(arr);
//      mergeSort(arr, 0, arr.length-1);
//      PracticeArray.traverse(arr);
    }
}
