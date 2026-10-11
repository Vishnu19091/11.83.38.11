package Basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyIterableInterface {
    public static void main(String[] args){
        LinkedList al = new LinkedList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        Iterator itr = al.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
