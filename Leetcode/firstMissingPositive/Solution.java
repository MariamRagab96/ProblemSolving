package Leetcode.firstMissingPositive;

//https://leetcode.com/problems/first-missing-positive/


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mariam Ragab It wants to solve this problem o(n) complexity if I used
 * sorting --> big O Notation o(n log n) I can use frequency Array if worst case
 * of nums[i] --> 10^6 maximum
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(firstMissingPositive(nums));
    }

    //using frequancy array not work because the worst case (2^31) -1 ---> 10^9
    public static int firstMissingPositive_v2(int[] nums) {
        int len = 2_147_483_647;
        System.out.println(len);
        int fre[] = new int[len + 1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                fre[nums[i]]++;
                System.out.println(nums[i]);
            }
        }
        int i;
        for (i = 0; i < fre.length; i++) {
            if (fre[i] == 0) {
                break;
            }
        }
        return i;
    }

    // o(n) 
    public static int firstMissingPositive(int[] nums) {
        // I 'll use HashMap because it make all operation o(1) --->Fast
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                map.put(nums[i], 1);
            }
        }
        int i;
        int len = 2_147_483_647;
        for (i = 1; i < len; i++) {
            if (map.get(i) == null) {
                break;
            }
        }
        return i;
    }
}
