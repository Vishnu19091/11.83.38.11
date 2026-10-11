package DSA.Arrays;

public class MaxConsecutive{
  static int maxConsecutive(int[] arr){
    int ans = 1;
    int cnt = 1;
    
    for(int i=1;i<arr.length;i++){
      if (arr[i-1] == arr[i]){
        cnt++;
      }
      else{
        cnt = 1;
      }
      // ans = Math.max(ans, cnt);
      
      // In-case if you're not allowed to use built-in function
      if(cnt > ans){
        ans=cnt;
      }
    }

    return ans;
  }
  public static void main(String[] args){
    int[] cns = {0,0,1,1,0,0,0,1,1,1,1};

    int ans = maxConsecutive(cns);

    System.out.println(ans);
  }
}
