package Leetcode.findTheDuplicateNumber;

//https://leetcode.com/problems/find-the-duplicate-number/
import static Leetcode.firstMissingPositive.Solution.firstMissingPositive;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(new Solution().findDuplicate(nums));
    }

    //using frequency array --> O(n) very fast
    public int findDuplicate(int[] nums) {
        int fre[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            fre[nums[i]]++;
        }
        int i;
        for (i = 0; i < nums.length; i++) {
            if (fre[i] > 1) {
                break;
            }
        }
        return i;
    }
}
