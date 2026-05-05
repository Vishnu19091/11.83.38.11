package DSA.Arrays.prblm_qn;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates{
  public static int removeDuplicatesTP(int[] arr){
    int n = arr.length;

    // if only one or empty array is passed, no operation executes
    if(n <= 1)
      return n;

    int i = 0;

    for(int j = 1; j<arr.length;j++){
      // check if the adjacent element is not same
      if(arr[j] != arr[i]){
        // then update the ith index element
        i++;
        arr[i]=arr[j];
        // updating next writePosition for unique element
//        i++;
      }
    }

    // later we can use this value to iterate first i unique elements
    // from array
    return i;
  }

  /**
   *
   * @param arr
   */
  public static List<Integer> remDupM2(int[] arr){
    List<Integer> result = new ArrayList<>();
    HashMap<Integer, Boolean> freq = new HashMap<>();

    for(int i : arr){
      if(!freq.containsKey(i)){
        freq.put(i, true);
        result.add(i);
      }
    }

    return result;
  }
  public static void main(String[] args){
    int[] duplicates = {1,1,1,2,2,2,3,3,4,4,4,5,5,6,6,7};

    List<Integer> u = remDupM2(duplicates);

//    for(int i = 0; i < u;i++){
//      System.out.print(duplicates[i]+ ", ");
//    }

    for(int n : u){
      System.out.println(n);
    }
  }
}
