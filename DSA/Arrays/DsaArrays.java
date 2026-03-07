public class DsaArrays {
  public void moveZeroesTwoPass(int[] nums){
    int writePos = 0;

    for(int i = 0; i < nums.length; i++){
      if (nums[i] != 0){
        nums[writePos] = nums[i];
        writePos++;
      }
    }

    while(writePos < nums.length){
      nums[writePos] = 0;
      writePos++;
    }
  }

  // Two pointers approach
  public void moveZeroesTP(int[] nums){
    int writePos = 0;

    for(int readPos = 0; readPos < nums.length; readPos++){
      if (nums[readPos] != 0){
        if(readPos != writePos){
          int temp = nums[readPos];
          nums[readPos] = nums[writePos];
          nums[writePos] = temp;
          writePos++;
        }
      }
    }
  }

  public int majorityElementBruteForce(int[] arr){
    int n = arr.length;
    for (int i = 0; i < n; i++){
      int count = 0;
      for (int j = 0; j < n; j++){
        if(arr[j] == arr[i]){
          count++;
        }
      }

      if(count > n / 2){
        return arr[i];
      }
    }
    return -1;
  }

  static void traverseArray(int[] arr){
    System.out.print("{");
    for (int i = 0; i<arr.length; i++){
      System.out.print(arr[i] + ", ");
    }
    System.out.print("null");
    System.out.println("}");
  }

  public static void main(String[] args){
    DsaArrays obj = new DsaArrays();
    int[] arr = {0,2,4,6,0,5,0,3,0,22,03};
    // obj.moveZeroesTwoPass(arr);
    obj.moveZeroesTP(arr);

    int[] arr2 = {2,2,1,1,3,2,3,3,3,3,3};
    int res = obj.majorityElementBruteForce(arr2);

    System.out.println(res);
    // traverseArray(arr);
  }
}
