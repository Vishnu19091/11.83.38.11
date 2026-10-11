package Basics.OOPS.Abstraction;

abstract class Pure {
  // pure abstract class
  abstract void M1();
  abstract void M2();
}

abstract class Animal {
  abstract void makeSound();
  void eat(){
    System.out.println("Animal eating");
  }
}

class Dog extends Animal {
  @Override
  void makeSound(){
    System.out.println("Dog barking...");
  }
}

abstract class Cat extends Animal {
  // does not implements makeSound()
}

public class AboutAbstraction {
  public static void main(String[] args) {
    Animal dog = new Dog();
    dog.makeSound();
  }
}
