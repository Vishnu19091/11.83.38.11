package Basics.OOPS;

class School{
  static void announceHoliday() {
    System.out.println("Holiday announced by the main school");
  }
}

class BranchSchool extends School{
  static void announceHoliday() {
    System.out.println("Holiday announced by the branch school");
  }
}

public class MethodHiding{
  public static void main(String[] args){
    School.announceHoliday();

    BranchSchool.announceHoliday();

    School s = new BranchSchool();
    s.announceHoliday();
  }
}
