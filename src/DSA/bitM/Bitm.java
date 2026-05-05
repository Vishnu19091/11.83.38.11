package DSA.bitM;

public class Bitm {
  public static void leftS(int a, int b){
    int res = a << b;
    System.out.println(res);
  }

  public static void setBit(int n, int k){
    int res = (n | (1 << k));
    System.out.println("Result -> " + res);
  }

  public static void checkBitIsSet(int n, int k){
    boolean res = (n & (1 << k)) != 0;
    System.out.println("Result -> " + res);
  }

  public static void clearBit(int n, int k){
    int res = n & ~(1 << k);
    System.out.println(res);
  }

  public static void toggleBit(int n, int k){
    int res = (n ^ (1 << k));
    System.out.println(res);
  }

  public static boolean checkPow2(int n){
    boolean res = n > 0 && (n & (n - 1)) == 0;
    System.out.println(res);
    return res;
  }

  public static void main(String[] args){
    //checkBitIsSet(13, 2);
    //setBit(5, 1);
    //clearBit(6, 0);
    toggleBit(5,3);
    checkPow2(8);
  }
}
