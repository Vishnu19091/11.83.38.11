public class PracticeArray{
  static int[] ProductSelf(int[] arr){
    int n = arr.length;
    int[] output = new int[n];

    output[0] = 1;
    // first pass
    for(int i = 1; i<n;i++){
      output[i]= output[i-1] * arr[i-1];
    }

    int right = 1;
    for(int i=n-1;i>=0;i--){
      output[i] = output[i] *right;
      right = right * arr[i];
    }

    return output;
  }

  static void traverse(int[] arr){
    for(int i =0; i < arr.length; i++){
      System.out.print(arr[i]+", ");
    }
  }
  public static void main(String[] args){
    int[] arr = {4,3,2,1};
    
    int[] res = ProductSelf(arr);

    traverse(res);
  }
}
