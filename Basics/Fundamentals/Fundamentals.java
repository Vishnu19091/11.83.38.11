import java.util.Scanner;

public class Fundamentals {
  
  /**
   * This class method gets user input and displays on o/p screen
   * First get Scanner class from utilities
   * and then create object instance of that class
   * then use its methods
   * @param sc
   */
  public String UserInput(Scanner sc){
    // Creating Scanner object
    // Scanner scn = new Scanner(System.in);
    
    System.out.print("Enter something in number: ");
    // int input = sc.nextInt(); // only integer data type value is allowed in this method
    // double inputDouble = sc.nextDouble(); // only double data type value is allowed in this method

    String iptString = sc.nextLine();
    return iptString;
  }


  public void pre_increment(){
    int value=10;
    System.out.println("Before pre-increment: " + value);
    System.out.println("After pre-increment: " + ++value);
  }

  public void post_increment(){
    int value=10;
    System.out.println("Before post-increment: " + value);
    System.out.println("After post-increment: " + value++);
    System.out.println("Current post-increment: " + value++);
  }

  /**
   * This function returns binary value of a number
   */
  public void decimalToBinary(int num){
    int[] binary = new int[35];
    int id = 0;

    while (num > 0){
      binary[id++]=num % 2;
      num = num / 2;
    }

    for (int i = id - 1; i >=0; i--){
      System.out.print(binary[i]+"");
    }
  }

  static void Math(){
    int base = 2;
    int power= 2;
    double result = Math.pow(base, power);
    System.out.println(result);
  }

  public static void main(String[] args) {
      Fundamentals obj= new Fundamentals();

      Scanner scn = new Scanner(System.in);

      String log=obj.UserInput(scn);
      System.out.println(log);

      // obj.pre_increment();
      // obj.post_increment();

      // obj.decimalToBinary(-12);
      // Math();
  }
}
