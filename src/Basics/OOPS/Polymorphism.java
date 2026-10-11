package Basics.OOPS;

class Par1{
    void disp1(){
        System.out.println("Inside Parent disp1");
    }

    void disp2(){
        System.out.println("Inside Parent disp2");
    }
}

class chil1d extends Par1{
    @Override
    void disp2(){
        System.out.println("Inside child disp2");
    }

    void disp3(){
        System.out.println("Child Specific method");
    }
}

class chil2d extends Par1{
    @Override
    void disp2(){
        System.out.println("Inside child disp2");
    }

    void disp3(){
        System.out.println("Child Specific method");
    }
}

public class Polymorphism {
    static void accessMethod(Par1 ref){
        ref.disp1();
        ref.disp2();
        if(ref instanceof chil1d){
            ((chil1d)(ref)).disp3();
        } else {
            ((chil2d)(ref)).disp3();
        }
    }
    public static void main(String[] args){
        Par1 obj1 = new chil1d();
        accessMethod(obj1);
//        obj.disp1();
//        obj.disp2();
//        obj is of type of parent type reference
//        so it is not allowed to call child specific methods
//      obj.disp3();
//        ((chil1d)(obj)).disp3();
        Par1 obj2 = new chil2d();
        accessMethod(obj2);
    }
}
