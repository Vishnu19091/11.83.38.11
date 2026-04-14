public class Basics {
    /**
     * Right Shift(left_operand >> right_operand) -
     * In simple it divides the left_operand by right_operand times by 2
     * Left Shift(left_operand << right_operand) -
     * In simple it multiplies the left_operand by right_operand times by 2
    */
    static void Bitwise_Operators(){
        int a = 60; /* 60 = 0011 1100 */
                            // 1111 0000
                            // 1100 0000
        int b = 13; /* 13 = 0000 1101 */

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("a >> 2: " + (a >> 2));
    }

    public static void TypeCasting(){
      int smallNumber = 50;
      double bigNum = smallNumber; // implicit casting
      System.out.println("Implicit Casting, int to double, num: "+bigNum);

      double bigV = 123.454;
      int smallV = (int) bigV; // Explicit Casting
      System.out.println("Explicit Casting, double to int, num: " + smallV);

      char c = 'A';
      int i = c +1;
      System.out.println((char)i);
    }

    static void calcArea(double r){
      return 3.14 * r * r;
    }

    public static void main(String[] args) {
        // Bitwise_Operators();
        // TypeCasting();
        double area = calcArea(5);
        System.out.println("Area: " + area);
    }
}
