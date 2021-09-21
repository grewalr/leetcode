package org.grewalr;

import java.util.HashMap;
import java.util.Map;

public class _14_LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Set the longest prefix to be the first
        // string in the list of strings
        String longestPrefix = strs[0];

        // Loop all strings in the array starting from index 1
        for (int i = 1; i < strs.length; i++) {
            String sampleStr = strs[i];

            // Check first string and second string to
            // get the longest prefix then continue to
            // next string
//            {"flower", "flow", "flight"}

            while (sampleStr.indexOf(longestPrefix) != 0) {
                longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
            }
        }

        return longestPrefix;
    }

    public static void main(String[] args) {
        _14_LongestCommonPrefix lcp = new _14_LongestCommonPrefix();

        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(lcp.longestCommonPrefix(strs1));

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(lcp.longestCommonPrefix(strs2));

        String[] strs3 = null;
        System.out.println(lcp.longestCommonPrefix(strs3));
    }
}
