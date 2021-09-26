package hackerrank.tagContentExtractor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://www.hackerrank.com/challenges/detect-html-tags/problem
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = Integer.parseInt(sc.nextLine());
        while (testCase-- > 0) {
            List<String> result = contentEnclosedWithinValidTags(sc.nextLine());
            for (String s : result) {
                System.out.println(s);
            }

        }
    }

    public static List<String> contentEnclosedWithinValidTags(String line) {
        List<String> result = new ArrayList<>();
        // each () is considered group
        Pattern pattern = Pattern.compile("<(.+)>([^<]+)</(\\1)>");
        Matcher matcher = pattern.matcher(line);
        boolean flag = true;
        while (matcher.find()) {
            result.add(matcher.group(2));
            flag = false;
        }
        if (flag) {
            result.add("None");
        }
        return result;
    }
}
