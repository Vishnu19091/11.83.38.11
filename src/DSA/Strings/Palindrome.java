public class Palindrome {
  public static boolean isPalindrome(String s){
    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) != s.charAt(s.length() - i - 1)){
        System.out.println("not a palindrome!");
        return false;
      }
    }

    System.out.println("It is a palindrome");
    return true;
  }

  public static void main(String[] args){
    isPalindrome("ab bla");
  }
}
