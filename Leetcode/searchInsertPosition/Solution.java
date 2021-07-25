package Leetcode.searchInsertPosition;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6}, target = 2;
        System.out.println(new Solution().searchInsert(nums, target));

    }

    public int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        index = index < 0 ? index * (-1) - 1 : index;
        return index;
    }
}
