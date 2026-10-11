package Basics.OOPS.Interface;

public class Square implements Shape{
    public void printA(){
        System.out.println(a);
    }

    @Override
    public void calcArea() {
        System.out.println("Calculation");
    }
}
