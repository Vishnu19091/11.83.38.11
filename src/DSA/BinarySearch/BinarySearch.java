package DSA.BinarySearch;

public class BinarySearch {
  public static int bs(int[] arr, int target){
    int left = 0;
    int right = arr.length-1;

    while(left <= right){
      int mid = (left + right) / 2;

      if(arr[mid] == target){
        return mid;
      }
      else if(arr[mid] < target){
        // if middle element's value is less than the target
        // we set left pointer to mid+1 index(we ignore mid, because we already checked that index)
        left = mid + 1;
      }
      else{
        // if middle element's value is greater than the target
        // we set right pointer to mid-1 index
        right = mid - 1;
      }
    }

    // if not found then return -1
    return -1;
  }
  
  public static void main(String[] args){
    int[] arr = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
    int res = bs(arr, 190);
    System.out.println("Element: "+ arr[res] +" found at index: " + res);
  }
}
