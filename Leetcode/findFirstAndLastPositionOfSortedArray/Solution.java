package Leetcode.findFirstAndLastPositionOfSortedArray;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // 1 ms  42.4 MB
    public static int[] searchRange(int[] nums, int target) {
        int f = 0, l = nums.length - 1;
        int mid = (f + l) / 2;
        int res[] = {-1, -1};
        if (nums.length != 0) {
            while (f <= l) {
                if (target > nums[mid]) {
                    f = mid + 1;
                } else if (target < nums[mid]) {
                    l = mid - 1;
                } else {
                    // System.out.println(mid);
                    int first = firstPosition(nums, mid);
                    System.out.println(first);
                    int last = lastPosition(nums, mid);
                    //  System.out.println(last);
                    res[0] = first;
                    res[1] = last;
                    break;
                }
                mid = (f + l) / 2;
            }
        }
        return res;
    }

    public static int lastPosition(int[] nums, int index) {
        while (index < nums.length - 1 && nums[index] == nums[index + 1]) {
            index++;
        }
        return index;
    }

    public static int firstPosition(int[] nums, int index) {
        while (index > 0 && nums[index] == nums[index - 1]) {
            index--;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        //printArray(nums);
        int target = sc.nextInt();
        int binarySearch = Arrays.binarySearch(nums, target);
        int[] search = searchRange(nums, target);
        System.out.println(search[0] + " " + search[1]);
    }

    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
    }
}
