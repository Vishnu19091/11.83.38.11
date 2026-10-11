package Basics.MyGenerics;

class Box<T>{
    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}

public class MyGenerics {
    public static <T> void display(T item){
        System.out.println("Item: " + item);
    }

    public static void main(String[] args){
        Box<String> b = new Box<>();
        b.setItem("Vishnu❤\uFE0FSwetha");
//        System.out.println(b.getItem());
//        display("123");
    }
}