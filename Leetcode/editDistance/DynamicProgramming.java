package editDistance;

// using DynamicProgramming to make memoization
public class DynamicProgramming {

    String s1;
    String s2;
    int dp[][];

    public DynamicProgramming(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
        dp = new int[s1.length() + 1][s2.length() + 1];
    }

    public int minDistanceUsingRecursion(int n, int m) {
         System.out.println("n m :" + n + " " + m);
        if (n == 0) {
            System.out.println("**m : " + m);
            return m;
        } else if (m == 0) {
            System.out.println("**n : " + n);
            return n;
        } else if (dp[n][m] != 0) {
            return dp[n][m];
        } else if (s1.charAt(n - 1) == s2.charAt(m - 1)) {
            dp[n][m] = minDistanceUsingRecursion(n - 1, m - 1);
        } else {
           
            dp[n][m] = 1 + Math.min(minDistanceUsingRecursion(n - 1, m),
                    Math.min(minDistanceUsingRecursion(n, m - 1), minDistanceUsingRecursion(n - 1, m - 1)));
            printTable();
            System.out.println("");
        }
        return dp[n][m];
    }

    public int minDistanceUsingIteration(int n, int m) {
        /*
        n represent length of String s1 horse 5
        m represent length of String s2 ros 3
         */
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {

                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }
        return dp[n][m];
    }

    public void printTable() {
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
