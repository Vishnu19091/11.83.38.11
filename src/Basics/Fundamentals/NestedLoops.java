public class NestedLoops{
  static void RunForLoop(){
    for(int i = 0; i <3; i++){
      for(int j = 0; j<=5; j++){
        System.out.println("i: " + i + ", j: " + j);
      }
    }
  }
  static void RunWhileLoop(){
    int i = 1;
    while (i <=5){
      int j = 1;
      while (j <= 5){
        System.out.println("i: " + i + ", j: " + j);
        j++;
      }
      i++;
    }
  }
  static void PrintPattern1(){
    for(int i =1; i<=5 ; i++){
      for(int j =1; j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  static void PP2(){
    for(int i=5;i>=1;i--){
      for(int j=1; j<=i;j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  // labled loops
  public static void labledLoops(){
outerLoop:
    for(int classRoom = 1; classRoom <= 3; classRoom++){
      for(int student=1; student <= 10; student++){
        // explicit type casting a random value
        // which is returned from Math.random()
        int score = (int) (Math.random()*100);
        System.out.println("Classroom: " + classRoom + " Student: " + student + " Score: " + score);
        if(score > 90){
          System.out.println("Found a student with more than 90 mark in classroom: " + classRoom);
          break outerLoop;
        }
      }
    }
  }

  public static void main(String[] args){
    //PrintPattern1();
    //PP2();
    labledLoops();
  }
}
