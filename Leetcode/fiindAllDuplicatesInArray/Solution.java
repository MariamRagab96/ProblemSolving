package Leetcode.fiindAllDuplicatesInArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    //https://leetcode.com/problems/find-all-duplicates-in-an-array/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = {1, 2};
        // List by default made overrride to toString()
        // so this function return values 
        System.out.println(new Solution().findDuplicates(nums));
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int fre[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            fre[nums[i]]++;
        }
        for (int i = 1; i < fre.length; i++) {
            if (fre[i] == 2) {
                list.add(i);
            }
        }
        return list;
    }
}
