package Leetcode.longestCommonPrefix;

// ** https://leetcode.com/problems/longest-common-prefix/submissions/
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};
        System.out.println(new Solution().longestCommonPrefix2(strs));
    }

    /* this solution is O(n)^2 
    
        it will be fit because the worest case is 200 --> 200*200 =40,000 -> 10^4
       
        i use Frecuancy array to solve it
     */
    public String longestCommonPrefix(String[] strs) {

        boolean flag = true;
        String res = "";
        int ind = 0;
        while (flag) {
            int fre[] = new int[26]; //Frecuancy array
            if (ind < strs[0].length()) {
                res += strs[0].charAt(ind);
            } else {
                flag = false;
                break;
            }
            for (int i = 0; i < strs.length; i++) {
                if (ind < strs[i].length()) {
                    fre[strs[i].charAt(ind) - 'a']++;
                }
            }
            if (fre[strs[0].charAt(ind) - 'a'] != strs.length) {
                res = res.substring(0, res.length() - 1);
                flag = false;
                break;
            }
            ind++;
        }
        return res;
    }

    /*
        this solution is O(n log n) 
    
        it will be faster 
       
        i use Sorting 
     */
    public String longestCommonPrefix2(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        } else if (strs.length == 0) {
            return "";
        } else {
            Arrays.sort(strs);
            int min = Math.min(strs[0].length(), strs[strs.length - 1].length());
            int i;
            for (i = 0; i < min; i++) {
                if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i)) {
                    break;
                }
            }
            return strs[0].substring(0, i);
        }
    }
}
