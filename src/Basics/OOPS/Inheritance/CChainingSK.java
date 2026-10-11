class Vehicle {
  int wheels;

  public Vehicle(int wheels){
    this.wheels = wheels;
    System.out.println("Vehicles with " + wheels + " wheels created.");
  }
}

class Car extends Vehicle {
  String model;

  public Car(String model){
    // this super() calls the parent class constructor (parameters are considered by explicit invocation)
    super(4);
    this.model = model;
  }
}
