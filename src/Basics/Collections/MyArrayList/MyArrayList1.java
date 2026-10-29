package Basics.Collections.MyArrayList;

import java.util.ArrayList;
import java.util.Iterator;

class Examp {
    String n1, n2;

    public Examp(String n1, String n2) {
        this.n1=n1;
        this.n2=n2;
    }
}


public class MyArrayList1 {
    public static void main(String[] args){
        ArrayList<Examp> al = new ArrayList<Examp>();

        al.add(new Examp("Test1", "Value1"));
        al.add(new Examp("Test2", "Value2"));
        al.add(new Examp("Test3", "Value3"));
        al.add(new Examp("Test4", "Value4"));
        al.add(new Examp("Test5", "Value5"));

        Iterator<Examp> it = al.iterator();

        while(it.hasNext()){
            Examp e= it.next();

            System.out.println(e.n1 + " " + e.n2);
        }
    }
}
