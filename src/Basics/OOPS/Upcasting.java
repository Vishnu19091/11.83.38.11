package Basics.OOPS;

class Developer {
    void work(){
        System.out.println("Developer Working.");
    }

    void project() {
        System.out.println("Developer doing project.");
    }
}

class JavaDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("JavaDeveloper Working.");
    }

    @Override
    void project() {
        System.out.println("JavaDeveloper doing project.");
    }
}

class PythonDeveloper extends Developer {
    @Override
    void work() {
        System.out.println("PythonDeveloper Working.");
    }

    @Override
    void project() {
        System.out.println("PythonDeveloper doing project.");
    }
}

public class Upcasting {
    public static void accessMethod(Developer dev) {
        dev.work();
        dev.project();
    }

    public static void main(String[] args) {
//      upcasting
//        Developer dev1 = new JavaDeveloper();

//      accessing overridden child methods
//      we can see that these methods repeated
//        dev1.work();
//        dev1.project();
//        accessMethod(dev1);
        // directly creating object and giving to parent type reference
        accessMethod(new JavaDeveloper());

//        Developer dev2 = new PythonDeveloper();
//        dev2.work();
//        dev2.project();
//        accessMethod(dev2);
        accessMethod(new PythonDeveloper());
    }
}
