package editDistance;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println(solution.minDistance(sc.nextLine(), sc.nextLine()));
    }

    public int minDistance(String s1, String s2) {

        DynamicProgramming dp = new DynamicProgramming(s1, s2);
        return dp.minDistanceUsingIteration(s1.length(), s2.length());
    }

}
