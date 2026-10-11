class StaticDemo {
  //static varible
  static String clg = "MGM University";

  // static method
  public static void changeClg(String newClg){
    clg=newClg;
    System.out.println("Static block executed!");
    System.out.println("College Name Changed to " + clg);
  }

  // non-static variable
  int x= 100;
  
  // non-static method
  public void func1(){
    System.out.println("Non-Static method is executing!");
  }
}

public class MyStatic{
  public static void main(String[] args){
    // accessing static components
    System.out.println("College = " + StaticDemo.clg);

    // Directly using class name
    StaticDemo.changeClg("Anna University");

    // accessing non-static components
    // creating object
    StaticDemo sd = new StaticDemo();

    // using object reference
    System.out.println("x = " + sd.x);

    // calling non-static method
    sd.func1();
  }
} 
