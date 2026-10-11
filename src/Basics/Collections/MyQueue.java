package Basics.Collections;
import javax.swing.plaf.synth.SynthTableHeaderUI;
import java.util.*;

public class MyQueue {
    public static void queue(){

//        Upcasting the Queue DataType
        Queue q = new LinkedList();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

        System.out.println(q.remove());//10
        System.out.println(q.remove());//20
        System.out.println(q.remove());//30
        System.out.println(q.remove());//40
        System.out.println(q.remove());//50
        System.out.println(q);
        System.out.println(q.remove());
    }

    public static void methods(){
        Queue q = new LinkedList();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q);

        System.out.println(q.poll());//10
        System.out.println(q.poll());//20
        System.out.println(q.poll());//30
        System.out.println(q.poll());//40
        System.out.println(q.poll());//50
        System.out.println(q);
    }

    public static void moreMethods(){
        Queue q = new LinkedList();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println(q.peek());//10
        System.out.println(q.poll());//10
        System.out.println(q);
        System.out.println(q.peek());
    }

    public static void main(String[] args){
//        queue();
//        methods();
//        moreMethods();
        MyArrayDeque.ad();
    }
}


class MyArrayDeque {
    public static void ad() {
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        ad.add(40);
        ad.add(50);
        System.out.println(ad);
        ad.addFirst(99);
        ad.addFirst(88);
        ad.addFirst(77);
        System.out.println(ad);
        System.out.println(ad.remove());//77
        System.out.println(ad.removeFirst());//88
        System.out.println(ad.removeLast());//50
        System.out.println(ad);
//
//        Deque Methods
//
//        addFirst()      Done
//
//        addLast()       Done
//
//        offerFirst()
//
//        offerLast()
//
//        removeFirst()    Done
//
//        removeLast()     Done
//
//        pollFirst()           Done
//
//        pollLast()            Done
//
//        peekFirst()         Done
//
//        peekLast()         Done
//
//        push()                Done
//
//        pop()                  Done
    }
    public static void main(String[] args){}

}