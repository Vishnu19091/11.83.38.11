// types of methods in java
// inherited method
// child-specific method
// overridden method
class ParentClass {
  public void display1(){
    System.out.println("Display 1 from Parent");
  }

  public void display2(){
    System.out.println("Display 2 from Parent");
  }
}

class ChildClass extends ParentClass {
  @Override
  public void display2(){
    System.out.println("Overriden Method of display 2 from child");
  }

  public void display3() {
    System.out.println("Display 3 from Child");
  }
}

public class MethodsT {
  public static void main(String[] args){
    ChildClass c = new ChildClass();
    c.display1();
    c.display2();
    c.display2();
    c.display3();
  }
}
