/*
 *this Problem wants to get the minimum Number does not find in this array 
  and read input from file 
 */
package Leetcode.MinumNumNotFind;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author pc
 */
public class Solution {

    public static void main(String[] args) {
        try {
            // start from root
            File file = new File("src\\Leetcode\\MinumNumNotFind\\input.ini");
            /*
                    getCanonicalPath () this fuction return 
                      the canonical pathname string denoting the same file or directory as this abstract pathname
                      path the you need to access this file without absoulote path
             */
            System.out.println(file.getCanonicalFile());
            Scanner sc = new Scanner(new BufferedInputStream(new FileInputStream(file)));
            while (sc.hasNextLine()) {
                int[] num = Stream.of(sc.nextLine().split(" ")).mapToInt(n -> Integer.parseInt(n)).toArray();
                System.out.println(solution(num));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Solution.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Solution.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int fre[] = new int[1000000 + 2];// 1 1 1 1 5 6 9
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                fre[A[i]]++;
            }
        }
        int i;
        for (i = 1; i < fre.length; i++) {
            if (fre[i] == 0) {
                break;
            }
        }
        return i;
    }
}
