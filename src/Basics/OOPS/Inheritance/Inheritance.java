package Basics.OOPS.Inheritance;

class Parent {
  private void display() {
    System.out.println("Inside Parent Display");
  }
}

class Child extends Parent {
  public void display1() {
    System.out.println("Inside Child Display1()");
  }
}

public class Inheritance{
  public static void main(String[] args) {
    Child c = new Child();
    Parent p = new Parent();
    //p.display();
    c.display1();
  }
}
