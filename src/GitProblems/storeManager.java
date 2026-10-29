package GitProblems;

/*
Difficulty: Easy | Marks: 10

Problem Description
        A store manager tracks how many customers enter each hour.
        At closing time, the manager needs to count how many hourly checkpoints had a cumulative
        visitor count greater than or equal to a daily milestone.
        For example, once the cumulative total reaches the milestone,
        that hour and any later hour also qualify because hourly entries are nonnegative.
        Count qualifying hour-end checkpoints, not individual visitors or the total number of customers.

Input Format
First line: n and milestone k. Second line: n nonnegative hourly counts.

Output Format
Print the number of hour-end checkpoints whose cumulative count is at least k.

Constraints
1 ≤ n ≤ 100000; 0 ≤ k ≤ 1000000000; 0 ≤ each hourly count ≤ 10000.

Sample Input
5 10
2 3 5 1 4

Sample Output
3

Sample Explanation
        The shown output follows the requirements for the supplied input.
        Check that values are calculated and printed in the specified order.

Test Cases
Test Case 1
Input:
        5 10
        2 3 5 1 4
Expected output:
        3

Test Case 2
Input:
        4 20
        1 2 3 4
Expected output:
        0

Test Case 3
Input:
        3 0
        0 0 0
Expected output:
        3

Test Case 4
Input:
        4 6
        6 0 2 1
Expected output:
        4
*/

import java.util.Scanner;

public class storeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input for n & milestone individually:");
        int n=sc.nextInt(); long milestone=sc.nextLong();
        int[] visits=new int[n];
        System.out.println("customer counts:");
        for(int i=0;i<n;i++) visits[i]=sc.nextInt();
        System.out.println(countMilestones(visits, milestone));
        sc.close();
    }

    public static int countMilestones(int[] visits, long milestone) {
        long count = 0;
        int checkpoint = 0;

        for(int i = 0; i < visits.length; i++){
            count+= visits[i];
            if(count >= milestone){
                checkpoint++;
            }
        }
        return checkpoint;
    }

}
