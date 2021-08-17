package Leetcode.findAllNumbersDisappearedInArray;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // List by default made overrride to toString()
        // so this function return values 
        System.out.println(new Solution().findDisappearedNumbers(nums));
    }

    //Using frequancy array
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int fre[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            fre[nums[i]]++;
        }
        for (int i = 1; i < fre.length; i++) {
            if (fre[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
