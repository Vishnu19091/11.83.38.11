package DSA.Arrays.prblm_qn;
import DSA.Arrays.PracticeArray;

import java.util.ArrayList;

public class SymmetricPair {
    /*
    * Problem Statement: Given an array of pairs,
    * find all the symmetric pairs in the array.
    * Example 1:
    * Input: (1,2),(2,1),(3,4),(4,5),(5,4)
    * Output: (2,1) (5,4)
    * Explanation: Since (1,2) and (2,1) are symmetric pairs and (4,5) and (5,4) are symmetric pairs.
    * Example 2:
    * Input: (1,5),(2,3),(4,2),(5,1),(2,4)
    * Output: (2,4) (5,1)
    * Explanation: Since (1,5) and (2,4) are symmetric pairs and (5,1) and (4,2) are symmetric pairs.
    */
    public static ArrayList<int[]> findSymmetricPair(int[][] arr){
        ArrayList<int[]> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if((arr[j][0] == arr[i][1]) && (arr[j][1] == arr[i][0])){
                    result.add(new int[]{arr[j][0], arr[j][1]});
                }
            }
        }

        return result;
    }
    public static void main(String[] args){
        ArrayList<int[]> res = findSymmetricPair(new int[][]{{1,2},{2,1},{3,4},{4,5},{5,4}});
        PracticeArray.traverseList(res);
    }
}
