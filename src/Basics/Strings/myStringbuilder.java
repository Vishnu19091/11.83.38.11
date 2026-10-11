package Basics.Strings;

class Mutable {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(40);
        System.out.println(sb.capacity());
    }
}

class Mutables {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());// 16
        sb.append("Java");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" is a programming language");
        System.out.println(sb);
        System.out.println(sb.capacity());// 16
        System.out.println(sb.length());//16

        sb.append(" and it is also object oriented p");
        System.out.println(sb.capacity());//70
        System.out.println(sb.length());
    }
}

public class myStringbuilder {
}
