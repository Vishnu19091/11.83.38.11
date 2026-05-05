package Basics.OOPS;

class Bicycle{
  // state or field or attributes
  // SYNTAX -> access_modifier type attribute_name;
  int gear = 5;

  // final - this is a keyword that makes the class attribute read-only
  final String ChainTeethsCount="200";

  // behavior or method
  public void braking(){
    System.out.println("Working of Braking");
  }
}

// access members of Bicycle class from MAIN CLASS
public class OOPS{
  public static void main(String[] args){
    Bicycle sportsBicycle = new Bicycle();
    // sportsBicycle.ChainTeethsCount="199"; //this will throw error because modifying variable that using final
    System.out.print(sportsBicycle.ChainTeethsCount);
  }
}
