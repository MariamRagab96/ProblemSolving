package Leetcode.IntegerToRoman;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //System.out.println(new Solution().intToRoman(sc.nextInt()));
        
        
       char d=84;
        System.out.println((byte)300);
    }

    public String intToRoman(int num) {
        Map< Integer, String> map = new HashMap<>();

        String res = "";
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");

        int temp = num;
        int l = 1;

        int length = 0;
        while (temp != 0) {
            temp /= 10;
            l *= 10;
            length++;
        }

        int arr[] = {1, 5, 10, 50, 100, 500, 1000};

        for (int i = 0; i < length; i++) {

            int n = num % l / (l / 10) * (l / 10);
            System.out.println(n);//444 1000
            String r = map.get(n);
            res += r != null ? r : "";
            System.out.println(r + "**");
            if (r == null) {
                while (n != 0) {
                    int remain = binarysearch_equalOrLess(arr, n);
                    res += map.get(binarysearch_equalOrLess(arr, n));
                    n -= remain;
                   // System.out.println(binarySearch);
                }
            }
            l /= 10;

        }

        return res;
    }

    public static int binarysearch_equalOrLess(int[] arr, int key) {

        int l = 0, r = arr.length, mid = (l + r) / 2;
        while (l <= r) {
            if (arr[mid] > key) {
                r = mid - 1;
            } else if (arr[mid] < key) {
                l = mid + 1;
            } else if (arr[mid] == key) {
                return arr[mid];
            }
            if (r == l && r == arr.length) {
                r--;
            }
            mid = (l + r) / 2;
        }
        return arr[r];
    }
}
