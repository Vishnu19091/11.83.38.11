
import java.util.Scanner;

public class ScannerBasics {
    static void FloatInput(){
        Scanner sn = new Scanner(System.in);

        System.out.print("Enter float number: ");
        String input = sn.next();

        System.out.println(input);

        sn.close();
    }

    public static void main(String[] args) {
        FloatInput();
    }
}
