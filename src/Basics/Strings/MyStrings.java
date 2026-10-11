package Basics.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class MyStrings{
  public static Scanner sc = new Scanner(System.in);

  static void String(){
    String b = "vishnu";
    System.out.println(b);
  
    // the below variable refers the same object
    String a = "vishnu";
    System.out.println(a);
  
    // the below statement is actually creating new object inside the jvm, we know that Strings are immutable.
    a = "Vishnu sah VT";
    System.out.println(a);
  }

  static void strip(String str){
    // the below line creates new object and is stored to res variable
    String res = str.strip();
    System.out.println(res);
  }

  static void split(String str){
    // this split method of string a returns a String[]
    String[] sArr = str.split(" ");
    System.out.println(Arrays.toString(sArr));
  }

  static void StringtoCharArray(String str){
    char[] cArr = str.toCharArray();
  
    // System.out.println(Arrays.toString(cArr));
  
    for(char c : cArr){
      System.out.println(c);
    }
  }

  static void comparison(){
    String a = "vishnu";
    String b = "vishnu";
    // this compares the object of both Strings
    // this both 'a' and 'b' refers same object in the string pool
    System.out.println("a == b : " + (a == b));

    // this creates new object regardless of object already that exists
    // in the string pool
    String c = new String("vishnu");
    String d = new String("vishnu");

    System.out.println("c == d : " + (c == d));

    // if we want to compare values
    System.out.println("value of c equals to value of d: " + c.equals(d));
  }

  static void prettyPrinting(){
    float a = 456.3122f;
    //System.out.printf("Formatted number is %.2f",a);
    System.out.println("Vishnu"+new ArrayList<>());

    System.out.println('a' + 'b');
    System.out.println("a" + "b");
    System.out.println('a' + 3);
  }

  static boolean isPalindrome(String str){
    if(str.length() == 0){
      return true;
    }

    StringBuilder sb = new StringBuilder(str.length());
    for(int i = str.length()-1; i >= 0; i--){
      sb.append(str.charAt(i));
    }

    return str.equals(sb.toString());
  }

  static void SB(){
    // builder with capacity of 100 characters
    // builder can auto resize its internal buffer to accommodate
    // more characters as they're added
    StringBuilder sb = new StringBuilder(100);
    for(int i =0; i < 200; i++){
      char c = (char) ('a' + i);
      sb.append(c);
    }

    System.out.println(sb);

    // sb.delete(0,20);
    // System.out.println(sb);
    // System.out.println(sb.charAt(2));
    

    String s = "Vishnu";
    System.out.println(Arrays.toString(s.toCharArray()));
  }

  static void reverse(String s){
    String sb = new StringBuilder(s).reverse().toString();
    System.out.println(sb);
  }

  public static void subString() {
    String str = "KodNest";
    for(int i = 0; i < str.length(); i++){
      String temp = "";
      for(int j = i; j < str.length(); j++){
        temp = temp + str.charAt(j);
        if(temp.equals("Kod")){
          System.out.println(temp);
          break;
        }
      }
    }
  }

  public static void regExp(){
    System.out.println("Enter some characters to run regExp check: ");
    String str = sc.nextLine();

    if(str.matches("[a-zA-Z0-9]*")){
      System.out.println("Valid string!");
    }
    else {
       System.out.println("Invalid String!");
    }
  }

  public static void replaceAll(){
    System.out.println("Enter String1, String2 and String3: ");
    String str1 = sc.next();
    String str2 = sc.next();
    String str3 = sc.next();

    String newstr1 = str1.replaceAll("[AEIOUaeiou]", "%");
    System.out.println(newstr1);

    String newstr2 = str2.replaceAll("[^AEIOUaeiou]", "#");
    System.out.println(newstr2);

    String newstr3 = str3.toUpperCase();
    System.out.println(newstr3);

    String result = newstr1+newstr2+newstr3;
    System.out.println(result);
  }

  public static void main(String[] args){
    //String();
    //comparison();
    //prettyPrinting();
    //SB();
    // reverse("HeLlO");
    //StringtoCharArray("Hello");
    //strip("      Meow     ");
    //split("Hey Hello, this is Meow ");
//    System.out.println(isPalindrome("a"));
//    subString();
//    regExp();
//    replaceAll();
    String str = sc.nextLine();
    String newstr = str.replaceAll("[' ']", "");
    System.out.println(newstr);
  }
}
