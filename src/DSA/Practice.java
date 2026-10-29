package DSA;

import java.util.*;

public class Practice {

//    Arrays
    public static void reverseArray(int[] arr) {
        int n = arr.length;
        int l =0;
        int r = n-1;

        while (l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            r--;
            l++;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void secondLarget(ArrayList<Integer> arrList) {
        int largest = arrList.getFirst();
        int slargest = -1;

        for(int el : arrList) {
            if(el > largest) {
                slargest = largest;
                largest = el;
            } else if (el > slargest && el < largest) {
                slargest = el;
            }
        }

        System.out.println(slargest);
    }

    public static void reArrange(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;
        int half = n / 2;
        int right = n - 1;

        while(half < right){
            int temp = arr[half];
            arr[half] = arr[right];
            arr[right] = temp;
            half++;
            right--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void largestSmallest(int[] arr) {
        int l = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;

        for(int i : arr) {
            if(i > l){
                l = i;
            }
            if(i < s) {
                s = i;
            }
        }

        System.out.println(l + " " + s);
    }

    public static void sumOfEven(LinkedList<Integer> ll) {

        Iterator<Integer> it = ll.iterator();
        int sum = 0;
        while(it.hasNext()){
            Integer num = it.next();

            if(num % 2 == 0){
                sum+=num;
            }
        }
        printI(sum);
    }

    public static void sumOfOdd(LinkedList<Integer> ll) {

        Iterator<Integer> it = ll.iterator();
        int sum = 0;
        while(it.hasNext()){
            Integer num = it.next();

            if(num % 2 != 0){
                sum+=num;
            }
        }
        printI(sum);
    }

    public static void printI(int n){
        System.out.println(n);
    }

    public static void remDuplicates(int[] arr) {
        int n = arr.length;

        if (n <= 1)
            System.out.println("None");

        int i = 0;

        for(int j = 1; j < n; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }

        // rewriting the duplicates to zeroes
        for(int j = i+1; j < n; j++){
            arr[j] = 0;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(i);

    }

    public static void moveZeroesEnd(int[] arr) {
        int n = arr.length;

        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static boolean checkSorted(int[] arr) {
        boolean res = true;

        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] <= arr[i+1]){
                continue;
            } else {
                res = false;
            }
        }
        return res;
    }

    public static void practiceStringBasics(){
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java Programming");
        String s4 = new String("Java Programming");

        if(s1 == s2){
            System.out.println("Both S1 & S2 are equal objects!");
        }

        if(s1.equals(s2)){
            System.out.println("Both S1 & S2 are equal Strings!");
        }

        if(s3 == s4){
            System.out.println("Both S3 & S4 are equal!");
        } else {
            System.out.println("Both S3 & S4 objects are not equal!");
        }

        if(s3.equals(s4)){
            System.out.println("Both S3 & S4 are equal Strings!");
        }
    }

    public static void palindromeCheck(String str) {
        int n = str.length();
        int i = 0;

        for(; i < n; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                System.out.println("String isn't palindrome!");
                break;
            }
        }
        if(i == n){
            System.out.println("String is palindrome!");
        }
    }

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

    public static void reverseWord(String str){
        String[] arr = str.split(" ");
        String[] res =new String[arr.length];

        for(int i = 0; i < arr.length;i++){
            StringBuilder rev = new StringBuilder(arr[i]);
            res[i] = rev.reverse().toString();
        }

        String fin = String.join(" ", res);
        System.out.println(fin);
    }

    public static void checkAnagram(String s1, String s2){
        int[] freq = new int[26];

        for(char c : s1.toCharArray()) freq[c - 'a']++;

        for(char c: s2.toCharArray()) freq[c - 'a']--;

        int i = 0;
        for(int f :freq){
            if(f != 0){
                System.out.println("Not an Anagram!");
                break;
            }
            i++;
        }

        if (i == s1.length()-1){
            System.out.println("Anagram!");
        }
    }

    public static void characterFreq(String s){
        int n = s.length();

        int[] arr = new int[26];

        for(int i = 0; i < n; i++){
            char c = s.charAt(i);

            arr[c-'a']++;
        }

        for(int i =0; i < arr.length; i++) {
            if(arr[i] >= 1){
                System.out.println((char)(i + 'a') + " " + arr[i]);
            }
        }

//        System.out.println(Arrays.toString(arr));
    }

    public static void rotateOne(int[] arr) {
        int n = arr.length;

        int temp = arr[0];

        for(int i =1; i < n; i++) arr[i-1] = arr[i];

        arr[n-1] = temp;
    }

    public static void rotateArr(int[] arr, int k){
        int n = arr.length;

        k = k % n;

        for(int i = 0; i < k; i++){
            rotateOne(arr);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        reverseArray(new int[] {1,2,3,4,5});
//        int[] samp={1,2,4,3,3,3,5,5,5,6,7,8,9,9};

//        ArrayList<Integer> al = new ArrayList<>();
//        Integer[] list = {100, 130, 123, 133};
//        Collections.addAll(al, list);
//        secondLarget(al);

//        reArrange(samp);
//        largestSmallest(samp);
//        LinkedList<Integer> ll = new LinkedList<>();
//        Integer[] samp1 = {10,11,12,13,14,15,16,17,18,19,20};
//
//        Collections.addAll(ll, samp1);
//        sumOfEven(ll);
//        sumOfOdd(ll);
//        remDuplicates(samp);

//        int[] zeroes={0,0,1,29,0,-2,0,11,0,22};
//        moveZeroesEnd(zeroes);
//        System.out.println(checkSorted(samp));
//        practiceStringBasics();
//        palindromeCheck("malayalam");
//        countVowelsConsonants("Hello, Hi my name is vishnu");
//        reverseWord("hello world");
//        checkAnagram("listen", "silent");
//        characterFreq("banana");
        rotateArr(new int[] {1,2,3,4,5}, 4);
    }

}
