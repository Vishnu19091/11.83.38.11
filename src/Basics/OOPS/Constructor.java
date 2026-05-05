package Basics.OOPS;

class Student{
  int age;
  String name;
  int rollNo;

  public Student(int age, String name, int rollNo){
    this.age = age;
    this.name = name;
    this.rollNo = rollNo;
  }
}

public class Constructor{
  public static void main(String[] args){
    Student s1 = new Student(22,"Vella",1505);
  
    System.out.println(s1.age);
    System.out.println(s1.name);
    System.out.println(s1.rollNo);
  }
}
