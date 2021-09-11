package hackerrank.JumpingOnTheClouds;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(jumpingOnClouds(list));
    }

    public static int jumpingOnClouds(List<Integer> c) {

        int i = 0, res = 0;
        int n = c.size();
        while (i < n - 1) {
            if (i < n - 2 && c.get(i + 2) != 1) { //0 
                i += 2;
                // System.out.println(i+" **");
            } else {
                i++;
                // System.out.println(i+" *");
            }
            res++;
        }
        return res;
    }

}
