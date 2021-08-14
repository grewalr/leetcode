package org.grewalr;

import java.util.HashMap;
import java.util.Map;

public class _14_LongestCommonPrefix {

    // NOTES:

    public String longestCommonPrefix(String[] strs) {
        // Possible look at tree data structure??




        return "";
    }

    public static void main(String[] args) {
        _14_LongestCommonPrefix lcp = new _14_LongestCommonPrefix();

        String a1 = lcp.longestCommonPrefix(new String[]{ "II", "" });
        System.out.println(a1);

        String a = lcp.longestCommonPrefix(new String[]{"III", ""});
        System.out.println(a);

        String b = lcp.longestCommonPrefix(new String[]{"IV", ""});
        System.out.println(b);

        String c = lcp.longestCommonPrefix(new String[]{"IX", ""});
        System.out.println(c);

        String d = lcp.longestCommonPrefix(new String[]{"LVIII", ""});
        System.out.println(d);

        String e = lcp.longestCommonPrefix(new String[]{"MCMXCIV", ""});
        System.out.println(e);

        String f = lcp.longestCommonPrefix(new String[]{"DXCI", ""});
        System.out.println(f);
    }
}
