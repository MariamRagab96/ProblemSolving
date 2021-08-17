package Leetcode.SingleNumber;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//https://leetcode.com/problems/single-number/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(new Main().singleNumber(nums));
    }

    //using HashMap --> O(1)for all operation very fast
    // This array contains positive and negative 
    public int singleNumber(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.remove(nums[i]);
            } else {
                map.put(nums[i], 1);
            }
        }
        return map.keySet().iterator().next();
      

    }
}
