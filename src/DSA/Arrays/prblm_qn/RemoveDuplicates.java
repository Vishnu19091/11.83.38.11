package DSA.Arrays.prblm_qn;

public class RemoveDuplicates{
  public static int removeDuplicatesTP(int[] arr){
    int n = arr.length;

    // if only one or empty array is passed, no operation executes
    if(n <= 1)
      return n;

    int i = 1;

    for(int j = 1; j<arr.length;j++){
      // check if the adjacent element is not same
      if(arr[j] != arr[j-1]){
        // then update the ith index element
        arr[i]=arr[j];
        // updating next writePosition for unique element
        i++;
      }
    }

    // later we can use this value to iterate first i unique elements
    // from array
    return i;
  }

  public static void main(String[] args){
    int[] duplicates = {1,2,2,3,4,4,4,5,5};

    int u = removeDuplicatesTP(duplicates);

    for(int i = 0; i < u;i++){
      System.out.println(duplicates[i]+ ", ");
    }
  }
}
