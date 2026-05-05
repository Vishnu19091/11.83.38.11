import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Students{
  // declaring attributes
  public int rollNo;
  public String name;

  // initializing attributes
  Students(int rollNo, String name){
    this.rollNo=rollNo;
    this.name=name;
  }
}

class MDArray{
  static Scanner sc = new Scanner(System.in);

  static void takeInput(){
    System.out.println("Enter no.of rows");
    int rows = sc.nextInt();
    System.out.println("Enter no.of columns");
    int cols = sc.nextInt();

    int[][] mDArr = new int[rows][cols];
    System.out.println("Enter element each after");
    for(int i =0; i<rows;i++){
      for(int j =0; j < cols; j++){
        mDArr[i][j]=sc.nextInt();
      }
    }
    sc.close();

    System.out.println("Printing Multi-Dimensional Array");
    for(int i =0;i<rows;i++){
      for(int j =0;j<cols;j++){
        System.out.print(mDArr[i][j] + " ");
      }
      System.out.println();
    }
  }
}

public class MyDemoArrays{
  
  // All Array concepts
  // primitive array
  // initialized memory for this array
  public int [] arr = new int[5];
  
  public void PopulateArray(){
    // instantiating the array/populating the array
    arr = new int[]{1,2,3,4,5}; // Replaces empty array with a new one
  }

  // passing arrays to a method
  /**
   * This method of class MyDemoArrays accepts int arrays as a parameter
   * then prints the sum of the array elements
   * @param arr
   * @return Sum
   */
  public void SumOfArrays(int[] arr){
    int sum=0;

    for (int i=0;i<arr.length;i++){
      sum+=arr[i];
    }

    System.out.println("Sum of Arrays is " + sum);
  }

  public void traverseStudents(Students[] arr){
    for (int i = 0; i < arr.length; i++){
      System.out.println("Name: " + arr[i].name + ", Roll.no: " + arr[i].rollNo);
    }
  }

  public void MultiDimensionArray(){
    // we can even initialize array without columns(like matrix)
    // because each one is stored as a object with its own size
    // int[][] arr = new int [3][];

    int[][] arr = {
      {1, 2, 3}, // 0th index
      {4, 5},  // 1st index
      {6, 7, 8, 9} // 2nd index
    };

    // traversing multi-dimensional array
    // for each row
    System.out.println("Traditional Method to print multi-dimensional array");
    for(int row = 0; row < arr.length; row++){
      // for each column in a row
      for(int col = 0; col < arr[row].length; col++){
        System.out.print(arr[row][col] + " ");
      }
      // new line
      System.out.println();
    }

    // alternate way to print multi-dimensional array with Arrays.toString()method
    System.out.println("Alternate way to print Multi-dimensional array");
    for(int row = 0; row < arr.length; row++){
      System.out.println(Arrays.toString(arr[row]));
    }
  }

  public static void DynamicArray(){
    // initial size, but size can be extended based on the need by the array
    ArrayList<Integer> list = new ArrayList<>(10);

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(7);
    list.add(8);
    list.add(9);
    list.add(10);
    list.add(11);
    list.add(12);
    list.add(13);
    list.add(14);
    list.add(15);

    // return boolean value
    System.out.println(list.contains(22));

    // printing dynamic array
    System.out.println(list);
  }

  
  public static void main(String[] args){
    MyDemoArrays arrays=new MyDemoArrays();

    // arrays.PopulateArray();
    // arrays.DisplayArray();

//    int[] sumArrays=arrays.ReturnArray();

    // arrays.SumOfArrays(sumArrays);

    // Array of Objects
    // declaring array of Students
    Students[] arr2;

    // allocating memory for 5 Objects of type Student
    arr2 = new Students[5];

    // initializing elements of the array
    arr2[0] = new Students(1, "Arthur Morgan");

    arr2[1] = new Students(2, "Jack");
    arr2[2] = new Students(3, "John Dihh");
    arr2[3] = new Students(4, "Dua Lipha");
    arr2[4] = new Students(5, "Kendrick Lamar");

    // arrays.DisplayArray(sumArrays);
    // arrays.traverseStudents(arr2);

    String[] Sarr = {"Nivi", "Vishnu", "Vishal", "Nish"};
    // System.out.println(Arrays.toString(Sarr));
    // arrays.MultiDimensionArray();
    
    // DynamicArray();
    int[] Marr = {1,2,44,22,44,124,21};
    //System.out.println(max(Marr));
    MDArray.takeInput();
  }
}
