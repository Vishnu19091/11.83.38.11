
public class MyString{
  static int reverseInt(int n){
    //Scanner sn = new Scanner(System.in);
    //int n = sn.nextInt();
    int sign = (n < 0) ? -1 : 1;
    // System.out.println(sign);
    if (n == 0 ){
      return 0;
    }

    if(sign == -1){
      n = n * sign;
    }

    int rev = 0;
    while(n > 0){
      int rem = n % 10;
      n = n / 10;
      if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)){
        rev = 0;
        return 0;
      }
      rev = rev * 10 + rem;
    }

    //sn.close();
    rev = rev * sign;
    System.out.println(rev);
    return rev;
  }

  /*
  Palindrome is nothing but if a string/number
  is reversed and same as the original is palindrome
  */
  static boolean is_Palindrome (int n){
    if (n < 0) return false;
    int res = reverseInt(n);
    //System.out.println(" res -> " + res);
    return res == n;
  }
  static void palindromeInArray(int[] arr){
    for (int i=0; i<arr.length;i++){
      if(is_Palindrome(arr[i])){
        System.out.println(arr[i]);
      }
    }
    System.out.println("0");
  }
  public static void main(String[] args){
    int[] arr = {15,16,18,21,22,33,43,55};
    palindromeInArray(arr);
  }
} 
