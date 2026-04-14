public class Student {
  // Declaring class attributes
  String name;
  int rollNo;
  String section;

  // Initializing class attributes
  // Default constructor
  Student(){
    name = "Unknown";
    rollNo = 0;
    section = "Unknown";
  }
  /**
   * Parameterized constructor
   * whatever parameters is passed when creating
   * instance of the object is created.
   */
  Student(String name, int rollNo, String section){
    this.name=name; // this.name refers to the instance variable
    this.rollNo=rollNo; // rollNo refers to the parameter
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
