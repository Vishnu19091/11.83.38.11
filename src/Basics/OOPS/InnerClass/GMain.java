package Basics.OOPS.InnerClass;

public class GMain {
    public static void main(String[] args) {
        InnrClass p1 = new InnrClass();
        InnrClass.TheIn p2 = p1.new TheIn();

        p2.disp2();
    }
}
