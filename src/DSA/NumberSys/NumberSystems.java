package DSA.NumberSys;

import java.util.Scanner;

public class NumberSystems {
    public static void binaryToDecimal(String s){
        int result = 0;
        int base = 1; // 2^0
        char[] c = s.toCharArray();

        for(int i = c.length - 1; i >= 0; i--){
//            if(s.charAt(i) == '1'){
            if(c[i] == '1'){
                result += base;
            }
            base *= 2;
        }

        System.out.println(result);
    }

    public static void bToD(String s){
        int result = Integer.parseInt(s, 2);
        System.out.println(result);
    }

    public static void binaryToOctal(String s){

    }

    public static String padRightZeros(String inputString, int length) {
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder(inputString);
        while (sb.length() < length ) {
            sb.append('0');
        }
//        sb.append(inputString);

        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        bToD(s);
        System.out.println(padRightZeros("11111111", 8));
    }
}