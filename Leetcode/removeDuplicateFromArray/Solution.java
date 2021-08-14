package Leetcode.removeDuplicateFromArray;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        Solution solution = new Solution();
        // int res = solution.removeDuplicates(nums);
        // System.out.println(res);

        System.out.println(solution.removeDuplicates_v2(nums));
    }

    // 2ms 45.6 MB
    public int removeDuplicates(int[] nums) {
        //Using frequancy array o(n)
        int fre[] = new int[202];
        for (int i = 0; i < nums.length; i++) {
            // make this because my array contains negative numbers
            fre[nums[i] + 100]++;
        }
        int ind = 0;
        for (int i = 0; i < 202; i++) {
            if (fre[i] != 0) {
                nums[ind] = (i - 100);
                ind++;
            }
        }
        // using stream API
        //(int) Arrays.stream(nums).distinct().count(); consume time //8ms
        return ind; //this is faster

    }

//   2ms 44.5 MB
    public int removeDuplicates_v2(int nums[]) {
        int ind = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            //System.out.println(nums[i] + " " + nums[i + 1]);
            if (nums[i] != nums[i + 1]) {
                nums[ind] = nums[i + 1];
                //printArray(nums);
                ind++;
            }

        }
        return ind;
    }

    public void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
    }
}
