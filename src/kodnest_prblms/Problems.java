import java.util.*;

class Validate_String {
  /*
   * given String s that may contain digits, signs, decimal points, and exponents.
   * Your task is to determine whether the given string represents a valid number
   * @return boolean
   */
  static boolean validateNumString(String s){
    if(s.matches("[+-]?\\d+([eE][+-]?\\d+)?") || s.matches("[+-]?\\d+\\.\\d+([eE][+-]?\\d+)")){
      return true;
    }
    return false;
  }
}

class Dcode{
  static StringBuilder dcode(String s){
    StringBuilder sb = new StringBuilder();
    int i = 0 ;

    while(i < s.length()){
      char c = s.charAt(i);
      i++;

      int count = 0;
      while(i < s.length() && Character.isDigit(s.charAt(i))){
        count = count * 10 + (s.charAt(i) - '0');
        i++;
      }

      for(int j =0 ; j< count; j++){
        sb.append(c);
      }
    }

    return sb;
  }
}

class profitStreak{

  static void run(Scanner sc){
    System.out.println("Enter days: ");
    int days = sc.nextInt();
    System.out.println("Enter target value K: ");
    int k = sc.nextInt();

    int[] arr = new int[days];
    System.out.println("Enter array elements, the size is" + days);
    for(int i = 0; i < days; i++){
      arr[i] = sc.nextInt();
    }

    int lpfr = longestProfitRun(arr);
    int csaws = countSubArraysWithSumK(arr,k);
    System.out.println(lpfr + " " + csaws);
  }

  static int longestProfitRun(int[] nums){
    int bestSum = 0;
    int currSum = 0;

    for(int v: nums){
      if(v > 0){
        currSum += v;
        if(currSum > bestSum){
          bestSum = currSum;
        }
      }
      else{
        currSum = 0;
      }
    }
    return bestSum;
  }

  static int countSubArraysWithSumK(int[] nums, int k){
    int prefix = 0;
    int count = 0;

    HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

    // subarray starts from index 0 where prefix itself equals 0
    freq.put(0,1);

    for(int v : nums){
      prefix += v;
      count += freq.getOrDefault(prefix - k, 1);
      freq.put(prefix, freq.getOrDefault(prefix, 0) + 1);
    }

    return count;
  }
}
public class Problems{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // String number = sc.nextLine();
    //System.out.println(Validate_String.validateNumString(number));
    // System.out.println(Dcode.dcode(number));

    profitStreak.run(sc);

    sc.close();
  }
}
