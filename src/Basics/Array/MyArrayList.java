import src.Basics.Array.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList {
    public Scanner sc = new Scanner(System.in);
    public static ArrayList al = new ArrayList<>();

    void takeInput(){
        System.out.println("ArrayList OPERATIONS:");
        System.out.println("Enter Size of the ArrayList:");
        int size = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Type of the ArrayList(Capitalize):");
        String type = sc.nextLine();
        
        switch(type){
            case "Integer" :
                ArrayList<Integer> iA = new ArrayList<>(size);
                System.out.println("Enter Elements of the ArrayList:");
                for (int i = 0; i < size; i++) {
                    iA.add(sc.nextInt());
                }
                System.out.println("Element in ArrayList");
                MyList.traverseIA(iA);

                break;

            case "String":
            
                default:
                    System.out.println("Invalid");
                    break;
        }
    }

    public static void main(String[] args) {
        System.out.println(al.size());
    }
}
