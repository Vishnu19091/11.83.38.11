import java.util.Scanner;

public class NT{
  public static StringBuilder primeFactors(int n){
    StringBuilder sb = new StringBuilder();

    while(n % 2 == 0){
      sb.append(2 + " ");
      n /= 2;
    }

    for(int i = 3; i <= n; i++){
      while(n % i == 0){
        sb.append(i + " ");
        n /= i;
      }
    }

    if(n > 2){
      sb.append(n + " ");
    }

    return sb;
  }

  public static int largestPF(int n){
    int ans=2;

    while(n%2==0){
      n/= 2;
    }

    for(int i =3;i <= n; i +=2){
      while(n % i == 0) {
        n /= i;
        ans = i;
      }
    }

    return ans;
  }

  public static long sumAP(long n, long a, long d){
    long ans = (n *(2*a+(n-1)*d))/2;
    return ans;
  }

  public static int gcd(int a, int b){
    if(b==0) return a;

    return gcd(b, a%b);
  }

  public static int GCD(int a, int b){
    return gcd(a,b);
  }

  public static int lcm(int a, int b){
    int hcf = gcd(a,b);
    int lcm = (a * b) / hcf;

    return lcm;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //System.out.println("Enter n: ");
    //int n = sc.nextInt();
    //if(n >= 2){
    //  System.out.println(largestPF(n));
    //}else{
    //  System.out.println("number must >= 2");
    //}
    //System.out.println(sumAP(5,1,3));
    //System.out.println(gcd(15,81));
    System.out.println(lcm(3,4));
  }
}
