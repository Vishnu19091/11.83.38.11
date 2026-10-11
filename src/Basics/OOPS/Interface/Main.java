package Basics.OOPS.Interface;

public class Main {
    public static void main(String[] args){
        Square s = new Square();
//        for interfaces we can't create object
//        but we can create parent type reference
        Shape s1 = s;
        s.printA();
    }
}
