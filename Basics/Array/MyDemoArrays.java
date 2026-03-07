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

  // traverse and display array of integer type
  public void DisplayArray(int[] array){
    int n = array.length;

    for (int i = 0; i < n; i++) {
        System.out.println(i+"->"+array[i]);
    }
  }

  public int[] ReturnArray(){
    return new int[] {1,2,3,4,5,6,7,8,9,10};
  }
  public static void main(String[] args){
    MyDemoArrays arrays=new MyDemoArrays();

    // arrays.PopulateArray();
    // arrays.DisplayArray();

    int[] sumArrays=arrays.ReturnArray();

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
    arrays.traverseStudents(arr2);
  }
}
