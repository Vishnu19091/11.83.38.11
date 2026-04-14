public class Pivot {
    public static int findPivot(int[] arr){
        int total_sum = 0;
        for(int i=0;i<arr.length;i++){
          total_sum+=arr[i];
        }

        int left_sum=0;
        for(int j=0;j<arr.length;j++){
          if(j!=0){
            left_sum+=arr[j-1];
          }
          if(total_sum-left_sum-arr[j]==left_sum){
            return j;
          }
        }

        return -1;
    }

    public static void main(String[] args){
      int[] arr={5,4,4,5,4};
      int res=findPivot(arr);
      System.out.println(res);
    }
}
