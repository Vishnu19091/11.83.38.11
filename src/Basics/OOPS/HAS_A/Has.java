package Basics.OOPS.HAS_A;

class OS{
  public OS(){
    System.out.println("OS installed!");
  }
  void checkOS(){
    System.out.println("OS is installed and executing");
  }
}

class Charger {
  Charger() {
    System.out.println("Charger created");
  }

  void getCharger() {
    System.out.println("Charger cable can be used for charging.");
  }
}

class Mobile {
  OS o = new OS();
  Mobile(){
    System.out.println("Mobile created with OS!");
  }

  void hasA(Charger c){
    System.out.println("Charger acquired and used for charging");
  }
}

public class Has {
  public static void main(String[] args){
    Mobile m;
    m = new Mobile();
    Charger c = new Charger();
    m = null;
    c.getCharger();
  }
}
