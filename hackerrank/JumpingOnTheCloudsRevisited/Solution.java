package hackerrank.JumpingOnTheCloudsRevisited;

import java.util.Scanner;

/**
 *
 * @Mariam Ragab
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(jumpingOnClouds_2(arr, k));
    }

    static int jumpingOnClouds(int[] c, int k) {
        int energy = 100, i = 0;
        do {
            energy -= c[i] == 1 ? 3 : 1;
            i = (i + k) % c.length;
        } while (i != 0);
        return energy;
    }

    /*
     * do {}while prevent to duplicate this statement agin
     energy -= c[i] == 1 ? 3 : 1;
     */
    static int jumpingOnClouds_2(int[] c, int k) {
        int energy = 100, i = k;
        while (i != 0) {
            energy -= c[i] == 1 ? 3 : 1;
            i = (i + k) % c.length;
        }
        energy -= c[i] == 1 ? 3 : 1;
        return energy;
    }

}
