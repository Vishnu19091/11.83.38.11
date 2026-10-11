package Basics.Strings;

public class StringBasics {
//    Mutable Strings
//    Method 1 type of String declaration
//    Creates objects in Constant Pool
    public static String s1 = "Java";
    public static String s2 = "Java";

//    Method 2 type of String declaration
//    Creates Objects in Non-Constant Pool
    public static String s3 = new String("Java");
    public static String s4 = new String("Java");

    static void stringMethods(){
        String str = "KodNest Technologies";

//        System.out.println(str);//KodNest Technologies
//
//        System.out.println(str.toLowerCase());
//
//        System.out.println(str.toUpperCase());
//
//        System.out.println(str.charAt(3));
//
//        System.out.println(str.contains("Nest"));
//
//        System.out.println(str.endsWith("ies"));

//        System.out.println(str.endsWith("kod"));
//
//        System.out.println(str.startsWith("Kod"));
//
//        System.out.println(str.startsWith("est"));
//
//        System.out.println(str.indexOf('e'));
//
//        System.out.println(str.lastIndexOf('e'));
//
//        System.out.println(str.isEmpty());
//
//        System.out.println(str.isBlank());

//        System.out.println(str.length());

//        System.out.println(str.replace('e', 'Z'));

//        System.out.println(str.substring(5));

        System.out.println(str.substring(0, 6));

//        String str2 = " Ko dN e st ";

//        System.out.println(str2);

//        System.out.println(str2.trim());

    }

    static void stringMethods2 (){
//        String greeting = "Hello".concat(" ").concat("Bro!");
//        System.out.println(greeting);
        String s1 = "Raja";
        String s2 = "raju";

        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Contents are same!");
        } else {
            System.out.println("Contents are not same!");
        }
    }

    static void blankEmpty() {
        String s = " ";
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
    }

    public static void main(String[] args){
//        System.out.println((s1 == s2) ? "Addresses are same": "Addresses are not same");
//
//        System.out.println((s3 == s4) ? "Addresses are same": "Addresses are not same");
//
//        System.out.println(s3.equals(s4));
        stringMethods();
//        stringMethods2();
//        blankEmpty();
    }
}
