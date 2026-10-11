import java.util.Arrays;

public class Anagram {
  // 
    static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] c1 = str1.toCharArray();
        // System.out.println(Arrays.toString(c1));
        // System.out.println(Arrays.toString(c1));

        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0; i<str1.length(); i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        if(isAnagram("Hello", "OlleH")){
            System.out.println("Valid Anagram");
        } else {
            System.out.println("Invalid Anagram");
        }
    }
}
