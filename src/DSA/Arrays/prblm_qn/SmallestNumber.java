package DSA.Arrays.prblm_qn;

public class SmallestNumber {
  public static void small(int[] arr){
    int res = Integer.MAX_VALUE;
    for(int n: arr){
      if(n < res){
        res = n;
      }
    }

    System.out.println(res);
  }
  public static void main(String[] args){
    small(new int[]{1,4,6,0,100});
  }
}
