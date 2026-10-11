package Basics.OOPS.Abstraction;

abstract class ParentClass{
  abstract void method1();
  abstract void method2();
  abstract void method3();
}

abstract class ChildClass extends ParentClass{
  @Override
  void method1(){
    System.out.println("Overridden method1 of parent class by child");
  }

  @Override
  void method2(){
    System.out.println("Overridden method2 of parent class by child");
  }
}

class Upc extends ChildClass{
  @Override
  void method3(){
    System.out.println("Overridden method3 of parent class by child");
  }
}

public class Abstraction {
  public static void main(String[] args){
    ParentClass cc = new Upc();
    accessm(cc);
  }

  static void accessm(ParentClass pc){
    pc.method1();
    pc.method2();
    pc.method3();
  }
}
