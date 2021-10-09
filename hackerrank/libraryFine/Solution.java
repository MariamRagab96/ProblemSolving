package hackerrank.libraryFine;

//https://www.hackerrank.com/challenges/library-fine/problem
public class Solution {

    /*
     * Complete the 'libraryFine' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER d1 returned
     *  2. INTEGER m1 returned
     *  3. INTEGER y1 returned
     *  4. INTEGER d2 expected
     *  5. INTEGER m2 expected
     *  6. INTEGER y2 expected
     */
    public static void main(String[] args) {

        System.out.println(libraryFine(15, 5, 2015, 1, 7, 2015));
    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        // Write your code here

        if (y1 == y2) {
            if (m1 == m2) {
                if (d1 > d2) {
                    return 15 * (d1 - d2);
                }
                return 0;
            }
            return m1 > m2 ? 500 * (m1 - m2) : 0;
        }
        return y1 > y2 ? 10000 : 0;

    }
}
