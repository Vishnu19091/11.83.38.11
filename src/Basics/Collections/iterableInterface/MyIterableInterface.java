package Basics.Collections.iterableInterface;

import java.util. ArrayList;
import java.util.Iterator;

public class MyIterableInterface {
    public static void main(String[] args) {
// Create an ArrayList of strings
        ArrayList<String> students = new ArrayList<>();

// Add elements to the ArrayList
        students.add("Aarav");
        students.add("Diya");
        students.add("Kabir");
        students.add("Anika");

// Get the iterator for the ArrayList
        Iterator<String> iterator = students.iterator();

// Use the iterator to loop through the ArrayList
        System.out.println("Students in the list:");
        while (iterator.hasNext()) {
            String student = iterator.next();
            System.out.println(student);
        }
    }
}