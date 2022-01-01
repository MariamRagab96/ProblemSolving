package Leetcode.longestSubstringWithoutRepeatingCharacters;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(new Solution().lengthOfLongestSubstring(sc.nextLine()));
    }

    public int lengthOfLongestSubstring(String s) {
        int res = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            //System.out.println(s.charAt(i));
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
                max++;
                //System.out.println(max + " " + map);
            } else {
                map.remove(s.charAt(j));
                max--;
                j++;
                i--;
            }
            if (max > res) {
                res = max;
            }
        }
        return res;
    }
}
