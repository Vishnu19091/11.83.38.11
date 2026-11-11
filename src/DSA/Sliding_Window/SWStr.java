package DSA.Sliding_Window;

public class SWStr {
    public static int countVowelMax(String s, int k){
        int n = s.length();

        int count = 0;

        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))) count++;
        }
        int best = count;

        for(int i = k; i<n; i++){
            if(isVowel(s.charAt(i))) count++;
            if(isVowel(s.charAt(i-k))) count--;
            best = Math.max(best,count);
        }
        return best;
    }

    public static boolean isVowel(char c) {
        boolean isVowel = String.valueOf(c).matches("[aeiouAEIOU]");

        return isVowel;
    }

    public static int countMaxWindow(String s, int k){
        int n = s.length();

        int res = n - k + 1;
        return res;
    }

    public static void main(String[] args) {
        //System.out.println(countVowelMax("Researching", 6));
        //System.out.println(countMaxWindow("Researching", 6));
	minWindow();
    }

	public static void minWindow(){
		String s = "ADOBECODEBANC";
		String t = "ABC";
		int left = 0, right = 0;
		int[] freq = new int[256];

		for(int i = 0; i < t.length(); i++) freq[s.charAt(i)]++;

		for(int i =0; i < s.length(); i++){
			freq[s.charAt(i)]++;
			while(freq[s.charAt(i)] > 2){
				freq[s.charAt(left)]--;
				left++;
			}
			right=i;
		}
		System.out.println(s.substring(left, right));
	}
}
