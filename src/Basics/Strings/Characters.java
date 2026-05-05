package Basics.Strings;
import java.util.Arrays;

public class Characters{

  /**
   * A new way to deal with anagrams
   * using arrays idea is you'll create 26 length int array stores only 0 at initial
   * and a loop is running inorder to store the no.of times a character appeared
   * in the array and again same loop is run with the second string but with decrementing the counts
   * so that if the array contains only zeroes it is a valid anagram.
   *
   * @param s1 String
   * @param s2 String
   * @return boolean
   */
  static boolean unknown(String s1, String s2){
    int[] freq = new int[26];

    for(char c : s1.toCharArray()){
      freq[c - 'a']++;
    }
    for(char c : s2.toCharArray()) freq[c - 'a']--;

    for(int n : freq){
      if(n != 0){
        return false;
      }
    }

    return true;
  }

  /**
   * Problem Statement: Write a program to change the case
   * (lower to upper and upper to lower cases) of each character of a given string.
   *
   * Example 1:
   * Input: String str = “javA”
   * Output: JAVa
   * Explanation:
   * Changed the lower case characters to uppercase and vice versa.
   *
   * Example 2:
   * Input: String str = “take u forward IS Awesome”
   * Output: TAKE U FORWARD is aWESOME
   * Explanation: Changed the lower case characters to uppercase and vice versa.
   *
   * @param str
   * @return String
   */
  public static String changeCase(String str){
    char[] carr = str.toCharArray();

    for(int c=0; c < carr.length; c++){
      if(Character.isLowerCase(carr[c])){
        carr[c] = Character.toUpperCase(carr[c]);
      } else{
        carr[c] = Character.toLowerCase(carr[c]);
      }
    }

    String result = new String(carr);
    return result;
  }

  static void character(){
    char euroSymbol = '\u20AC';
    System.out.println(euroSymbol);
  }

  // this was an accidental solution implementation by me 🥶
  public static String sortCharacters(String str){
    int[] index = new int[26];

    for(char c : str.toCharArray()) index[c - 'a']++;
    StringBuilder sb = new StringBuilder();

    for(int i=0; i < index.length; i++){
      if(index[i] == 1){
        sb.append((char) ('a' + i));
      }
    }

    return sb.toString();
  }


  /**
   * Problem Statement: Given two strings, write a program to remove characters
   * from the first string which are present in the second string.
   *
   * Examples
   * Input: str1 = “abcdef”, str2 = “cefz”
   * Output: “abd”
   * Explanation: The common characters in both strings are c, e, f.
   *
   * Input: str1 = “xyzpw”, str2 = "lmno"
   * Output: “xyzpw”
   * Explanation: There are no common characters.
   * @param str1 String
   * @param str2 String
   * @return String
   */
  public static String removeAnagramCharacters(String str1, String str2){
    int[] freq = new int[26];

    for(char c : str1.toCharArray()) freq[c - 'a']++;
    for(char c : str2.toCharArray()) freq[c - 'a']--;
    
    StringBuilder sb = new StringBuilder();

    for(int n = 0; n < freq.length; n++){
      if(freq[n] == 1){
        sb.append((char)('a'+n));
      }
    }

    return sb.toString();
  }

  public static void main(String[] args){
    // System.out.println((char)(int)('b'+1));
    // System.out.println((char)('c' - 'a'));
//    System.out.println(unknown("rat","car"));
//    character();
//    System.out.println(sortCharacters("qwertyuiopasdfghjklzxcvbnm"));
//    System.out.println(removeAnagramCharacters("xyzpw", "lmno"));
      System.out.println(changeCase("Take u Forward is Awesome"));
  }
}
