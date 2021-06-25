/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leetcode.twoSum;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author pc
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int target = sc.nextInt();

        /* if i take all elements of array as String in one line 
        Using stream 
         */
        IntStream stream = Stream.of(s.substring(1, s.length() - 1).split(",")).mapToInt(num -> Integer.parseInt(num));
        int[] arr = stream.toArray();

        int[] res1 = new Solution().twoSum_v2(arr, target);
        System.out.println(res1[0] + " " + res1[1]);

        //****************************************//
        int[] res2 = new Solution().twoSum_v1(arr, target);
        System.out.println(res2[0] + " " + res2[1]);
    }
}
