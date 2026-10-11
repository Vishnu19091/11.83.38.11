package Basics.Fundamentals;

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

    static double calcArea(double r){
      return 3.14 * r * r;
    }

    static void numberSystem() {

        /*
        ============================================================
        BYTE
        ============================================================

        DataType : byte
        Size     : 1 byte (8 bits)

        Range:
        -2^7 to 2^7 - 1
        -128 to 127

        Valid Number Systems:
        Base 10 (Decimal)
        Base 8  (Octal)
        Base 16 (Hexadecimal)
        Base 2  (Binary)
        */

        // Decimal
        byte byteDecimal = 100;

        // Octal
        byte byteOctal = 0100;

        // Hexadecimal
        byte byteHex = 0x64;

        // Binary
        byte byteBinary = 0b1100100;

        System.out.println(
                byteDecimal + " " +
                        byteOctal + " " +
                        byteHex + " " +
                        byteBinary
        );



        /*
        ============================================================
        SHORT
        ============================================================

        DataType : short
        Size     : 2 bytes (16 bits)

        Range:
        -2^15 to 2^15 - 1
        -32768 to 32767
        */

        short shortDecimal = 1000;
        short shortOctal = 01750;
        short shortHex = 0x3E8;
        short shortBinary = 0b1111101000;

        System.out.println(
                shortDecimal + " " +
                        shortOctal + " " +
                        shortHex + " " +
                        shortBinary
        );



        /*
        ============================================================
        INT
        ============================================================

        DataType : int
        Size     : 4 bytes (32 bits)

        Range:
        -2^31 to 2^31 - 1
        -2147483648 to 2147483647
        */

        // Decimal
        int intDecimal = 45;

        // Octal
        int intOctal = 045;

        // Hexadecimal
        int intHex = 0x1F;

        // Binary
        int intBinary = 0b101101;

        System.out.println(
                intDecimal + " " +
                        intOctal + " " +
                        intHex + " " +
                        intBinary
        );



        /*
        ============================================================
        LONG
        ============================================================

        DataType : long
        Size     : 8 bytes (64 bits)

        Range:
        -2^63 to 2^63 - 1
        -9223372036854775808 to 9223372036854775807

        NOTE:
        long values must end with L
        */

        long longDecimal = 100000L;
        long longOctal = 0303240L;
        long longHex = 0x186A0L;
        long longBinary = 0b11000011010100000L;

        System.out.println(
                longDecimal + " " +
                        longOctal + " " +
                        longHex + " " +
                        longBinary
        );



        /*
        ============================================================
        FLOAT
        ============================================================

        DataType : float
        Size     : 4 bytes (32 bits)

        Approx Range:
        ±3.4E−38 to ±3.4E38

        NOTE:
        float values must end with F
        */

        // Decimal
        float floatDecimal = 12.5F;

        // Scientific notation
        float floatScientific = 1.25e1F;

        System.out.println(
                floatDecimal + " " +
                        floatScientific
        );



        /*
        ============================================================
        DOUBLE
        ============================================================

        DataType : double
        Size     : 8 bytes (64 bits)

        Approx Range:
        ±1.7E−308 to ±1.7E308
        */

        double doubleDecimal = 12.5;
        double doubleScientific = 1.25e1;

        System.out.println(
                doubleDecimal + " " +
                        doubleScientific
        );



        /*
        ============================================================
        CHAR
        ============================================================

        DataType : char
        Size     : 2 bytes (16 bits)

        Range:
        0 to 65535 (Unicode)
        */

        // Character literal
        char charLiteral = 'A';

        // ASCII value
        char charAscii = 65;

        // Hexadecimal Unicode
        char charHex = 0x0041;

        // Binary
        char charBinary = 0b1000001;

        System.out.println(
                charLiteral + " " +
                        charAscii + " " +
                        charHex + " " +
                        charBinary
        );



        /*
        ============================================================
        BOOLEAN
        ============================================================

        DataType : boolean

        Valid Values:
        true
        false
        */

        boolean boolTrue = true;
        boolean boolFalse = false;

        System.out.println(
                boolTrue + " " +
                        boolFalse
        );
    }


    public static void main(String[] args) {
        // Bitwise_Operators();
        // TypeCasting();
//        double area = calcArea(5);
//        System.out.println("Area: " + area);
//        numberSystem();
        int b = 0XFFFFFFFE;
        System.out.println(b);
    }
}
