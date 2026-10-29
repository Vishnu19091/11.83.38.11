package DSA.Strings;
import java.util.Arrays;
import java.util.HashMap;

class printDuplicates{
    /**
     * Problem Statement: Given a string of characters from a to z.
     * Print the duplicate characters(which are occurring more than once) in the given string with their occurrences count.
     *
     * Input: str= "sinstriiintng"
     * Output: [i: 4, n: 3, s: 2, t: 2]
     * Explanation: In the above example, 's' occurs twice, 'i' occurs four times, 't' occurs twice and 'n' occurs thrice. 'r' and 'g' occur only one time and hence are not considered.
     *
     * Input: str= "abcdefg"
     * Output: []
     * Explanation: All characters occur once.
     *
     * @param str
     */
    public static void printDupStr(String str){
        HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
        char[] carr = str.toCharArray();

        for(char ch : carr){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int maxFreq = 0;
        char maxChar = '\0';
        for(HashMap.Entry<Character, Integer> entry : freq.entrySet()){
            if((entry.getValue() > 1)){
                System.out.println(entry.getKey() + ": freq ->" + entry.getValue());
            }
        }
    }

    public static String reverseWord(String str){
        String[] sarr = str.split(" ");

        int start = 0;
        int end = sarr.length-1;

        while(start < end){
            String temp = sarr[start];
            sarr[start] = sarr[end];
            sarr[end] = temp;
            start++;
            end--;
        }

        String result = Arrays.toString(sarr);
        System.out.println(result);
        return result;
    }
}

class Capitalize{
    public static String capitalizeFirst_Last_word(String str){
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        int start = 0;
        String[] sarr = str.split(" ");

        for(int i = 0; i < sarr.length; i++){
            sb.append(Character.toUpperCase(sarr[i].charAt(0)));

            if(sarr[i].length() > 1){
                sb.append(sarr[i].substring(1, sarr[i].length()-1));
                sb.append(Character.toUpperCase(sarr[i].charAt(sarr[i].length()-1)));
            }

            sb.append(" ");
        }

        return sb.toString();
    }
}

class OMGStrings{
    public static int giveASCII(char c){
        int result = (int)(c);
        return result;
    }

    public static String removeVowels(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i'
                    || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U'){
                continue;
            } else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String removeSpace(String str){
        StringBuilder sb = new StringBuilder();

        for(char c : str.toCharArray()){
            if(c == ' '){
                continue;
            }
            sb.append(c);
        }

        return sb.toString();
    }

    public static String preserveAlphabets(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static String remBrackets(String str){
        StringBuilder sb = new StringBuilder();

        for(int i =0 ; i< str.length(); i++){
          char ch = str.charAt(i);
          if(ch == '(' || ch == ')'){
            continue;
          }
          sb.append(ch);
        }

        return sb.toString();
    }
}

public class CountVowels {
    public static void countVowelsConsonants(String s){
        s = s.toLowerCase();
        int vowels = 0;
        int consonants = 0;
        int whitespaces = 0;

        for(int i = 0; i < s.length(); i++){
            char at = s.charAt(i);

            if(at == 'a' || at == 'e' || at == 'i' || at == 'o' || at == 'u'){
                vowels++;
            } else if(at >= 'a' && at <= 'z'){
                consonants++;
            } else if(at == ' '){
                whitespaces++;
            }
        }

        System.out.println(s);
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("WhiteSpaces: " + whitespaces);
    }

    public static void main(String[] args){
//        countVowelsConsonants("The name is Vishnu VT");
        System.out.println(OMGStrings.giveASCII('O'));
//        System.out.println(removeVowels("Hello This is Elisa"));
//        System.out.println(removeSpace("Hello This is Elisa"));
//        System.out.println(OMGStrings.preserveAlphabets("JAVA, Cpp && Python"));
//        System.out.println(OMGStrings.remBrackets("(a+(b-c)*2)"));
//        System.out.println(Capitalize.capitalizeFirst_Last_word("take u forward is awesome"));
//        printDuplicates.printDupStr("sinstriiintng");
        printDuplicates.reverseWord("Take U Forward!");
    }
}
