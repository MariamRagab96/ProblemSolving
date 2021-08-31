package hackerrank.minimumLoss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Solution {

//https://www.hackerrank.com/challenges/minimum-loss/problem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }

        System.out.println(minimumLoss(list));
    }

    // //O(n) + O(n(logn))  + //O(n) --> 2//O(n)+ O(n(logn)) --> O(n(logn))
    public static int minimumLoss(List<Long> price) {

        // each Operation is executed in O(1)
        Map<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < price.size(); i++) { //O(n)
            map.put(price.get(i), i); //O(1)
        }
        //sorting in descending order using comparator interface 
        //(num1, num2) -> (int) (num2 - num1)
        price = price.stream().sorted().
                collect(Collectors.toList());  //O(n(logn)) 
        long mini = Integer.MAX_VALUE;
        for (int i = 0; i < price.size() - 1; i++) { //O(n)
            if (map.get(price.get(i + 1)) < map.get(price.get(i))
                    && price.get(i + 1) - price.get(i) < mini) {
                mini = price.get(i + 1) - price.get(i);
                // System.out.println(mini);
            }
        }
        return (int) mini;

    }

}
