package DSA.Strings;

public class Words {
    public static void largestWord(String str1){
        String[] sarr = str1.split(" ");

        int max = 0;
        String sb = "";
        for(String s : sarr){
            if(s.length() > max){
                max = s.length();
                sb = s;
            }
        }

        System.out.println(sb);
    }

    public static void main(String[] args){
        largestWord("i b it's");
    }
}
