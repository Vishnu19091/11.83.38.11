package Basics.OOPS.InnerClass;

public class InnrClass {

    int a = 10;

    class TheIn {
        int b = 20;
        void disp2() {
            System.out.println(a);
            System.out.println(b);
        }
    }

    void disp1() {
        System.out.println(a);
    }
}
