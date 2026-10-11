package DSA.Arrays.prblm_qn;
import java.util.Arrays;

public class ArraySum {
    public static void calcAverage(int n, int[] arr){
        int sum = Arrays.stream(arr).sum();
        float result = (float)sum / n;
        System.out.println(String.format("%.1f",result));
    }

    public static void sum(int[] arr){
        int res = Arrays.stream(arr).sum();
        System.out.println(res);
    }
    public static void main(String[] args){
        calcAverage(6,new int[]{1,2,1,1,5,1});
    }
}
