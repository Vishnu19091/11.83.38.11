public class Student {
  // Declaring attributes
  String name;
  int rollNo;
  String section;

  // Initializing attributes
  Student(String name, int rollNo, String section){
    this.name=name;
    this.rollNo=rollNo;
    this.section=section;
  }

  // print details
  public void printDetails(){
    System.out.println("Stud Details: " + this.name + "," + " " + this.rollNo);
  }

  public static void main(String[] args){
    Student s1=new Student("Arthur Morgan", 1, "Outlaw");

    // print student details
    s1.printDetails();
  }
}
