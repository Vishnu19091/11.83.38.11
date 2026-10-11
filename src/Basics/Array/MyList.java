package src.Basics.Array;
import java.util.ArrayList;
import java.util.List;

public class MyList {
// Creating a List of Strings using ArrayList
  List<String> li = new ArrayList<>();

  void initCapactiy(){
    ArrayList<Integer> list = new ArrayList<>();
    System.out.println(list.size());
  }
  
  void operations(){
    // Adding elements in List
    li.add("Java");
    li.add("Python");
    li.add("DSA");
    li.add("C++");


    // Now remove element from the above list present at 1st index
    li.remove(1);

    System.out.println("After the Index Removal " + li);

    // Now remove the current object from the updated List
    li.remove("Java");
  
    // System.out.println("Elements of List are:");
  }

  void traverseSA(List<String> list){
    for(String s : list){
      System.out.println(s);
    }
  }

  void traversLA(List<Character> list){
    for (int i = 0; i < list.size(); i++) {
      System.out.println((i+1) + ". " + list.get(i));   
    }
  }

  public static void traverseIA(List<Integer> list){
    // Iterating through the list
    for (int i : list) {
      System.out.println(i);
    }
  }


  public static void main(String[] args) {

      List<String> lis = new ArrayList<String>();
      lis.add("Java");
      lis.add("Data Structures & Algorithms");
      lis.add("Linux");
      lis.add("Shell");
      lis.add("Maven");

      // l.traverseLA(lis);
      // l.initCapactiy();
  }
}
