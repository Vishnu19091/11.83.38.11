package Basics.Collections.MySet;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class MyLinkedHashSet {
    public static void stimulateLinkedHashSet(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter initial input n:");
        int n = sc.nextInt();
        sc.nextLine(); // Clear buffer

        Set<String> lhs = new LinkedHashSet<>();

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++){
            lhs.add(sc.nextLine());
        }

        // Priming read for the loop
        System.out.println("\nEnter operation (ADD, REMOVE, CHECK, PRINT, STOP):");
        String input = sc.next();
        sc.nextLine(); // Clear buffer

        while(!input.equals("STOP")){
            switch (input){
                case "ADD":
                    System.out.println("Enter element to add:");
                    lhs.add(sc.nextLine());
                    break;

                case "REMOVE":
                    System.out.println("Enter element to remove:");
                    lhs.remove(sc.nextLine());
                    break;

                case "CHECK":
                    System.out.println("Enter element to check:");
                    String ele = sc.nextLine();
                    if (lhs.contains(ele)) {
                        System.out.println("The element \"" + ele + "\" found!");
                    } else {
                        System.out.println("The element \"" + ele + "\" NOT found!");
                    }
                    break;

                case "PRINT":
                    System.out.println("Current Set: " + lhs);
                    break;

                case "STOP":
                    return; // Gracefully exits the method

                default:
                    System.out.println("Invalid Operation!");
            }

            // CRITICAL FIX: Ask for the next input before the loop cycles back
            System.out.println("\nEnter next operation (ADD, REMOVE, CHECK, PRINT, STOP):");
            input = sc.next();
            sc.nextLine(); // Clear buffer
        }
    }

    public static void main(String[] args){
        stimulateLinkedHashSet();
    }
}
