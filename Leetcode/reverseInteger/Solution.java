package Leetcode.reverseInteger;

//https://leetcode.com/problems/reverse-integer/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(reverse(sc.nextInt()));
    }

    public static int reverse(int x) {
        long res = 0;
        boolean isPositive = true;
        if (x < 0) {
            x *= -1;
            isPositive = false;
        }

        while (x > 0) {
            res += (x % 10);
            res *= 10;
            x /= 10;
        }
        res = (res / 10);
        res = isPositive ? res : res * -1;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) res;
    }
}
