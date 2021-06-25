package Leetcode.twoSum;

/**
 * in this Problem Given an array of integers and an integer target, return
 * indices of the two numbers such that they add up to target. "assume that each
 * input would have exactly one solution"
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    // The Complexity is o(n)  takes 1min 
    public int[] twoSum_v1(int[] nums, int target) {
        return twoSumUsingMap(nums, target);
    }

    // The Complexity is 2o(n(logn))+ 2o(n) ->>> o(n(logn)) takes 2min
    public int[] twoSum_v2(int[] nums, int target) {
        int res[] = new int[2];
        int copy[] = Arrays.copyOf(nums, nums.length); //o(n)

        Arrays.sort(nums);   // o(n(logn))
        for (int i = 0; i < nums.length; i++) {

            int index = Arrays.binarySearch(nums, i + 1, nums.length, target - nums[i]);// o(n(logn))
            if (index > -1) {
                res = linearSearch(copy, nums, index, target); //o(n)
                break;
            }
        }

        return res;
    }

    public int[] linearSearch(int[] beforeSort, int[] afterSort, int index, int target) {
        int res[] = new int[2];
        boolean flag1 = false, flag2 = false;
        for (int j = 0; j < beforeSort.length; j++) { //o(n)
            if (!flag1 && beforeSort[j] == afterSort[index]) {
                res[0] = j;
                flag1 = true;
            } else if (!flag2 && beforeSort[j] == target - afterSort[index]) {
                res[1] = j;
                flag2 = true;
            }
            if (flag1 && flag2) {
                break;
            }
        }
        return res;
    }

    public int[] twoSumUsingMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) { //o(1)
                return (int[]) (new int[]{map.get(complement), i});
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Result");
    }
}
