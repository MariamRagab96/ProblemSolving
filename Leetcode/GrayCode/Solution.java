package GrayCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList();
        int lengthOfFreqArray = 1 << n; // shift left to get the value of 2^n
        int[] freArray = new int[lengthOfFreqArray];
        freArray[0] = 1;
        list.add(0);
        for (int i = 0; i < lengthOfFreqArray - 1; i++) {
            for (int j = 0; j < 17; j++) {
                int grayCode = list.get(i);
                grayCode ^= (1 << j);
                //System.out.print(" i --> "+i +" : x -->  " + x);
                if (freArray[grayCode] == 0) {
                    // System.out.println();
                    freArray[grayCode] = 1;
                    list.add(grayCode);
                    break;
                }

                //  System.out.println(" repeted");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(new Solution().grayCode(n));

    }
}
