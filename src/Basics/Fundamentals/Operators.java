public class Operators{
  public static void main(String[] args){
    int a =100;
    int b=200;
    b=a++ + b++;
    System.out.println(a++ + " " + --b);
    System.out.println(a + " " + b);
  }
}
