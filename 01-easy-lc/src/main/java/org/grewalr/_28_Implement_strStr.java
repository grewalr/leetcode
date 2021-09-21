package org.grewalr;

public class _28_Implement_strStr {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (needle.length() > haystack.length()) return -1;

        char[] haystackCharArr = haystack.toCharArray();
        char needleFirstChar = needle.charAt(0);

        for (int i = 0; i < haystackCharArr.length; i++) {
            if (haystackCharArr[i] == needleFirstChar) {
                int end = i + needle.length();

                if (end > haystack.length()) return -1;

                String needleInHaystack = haystack.substring(i, end);
                if (needleInHaystack.equals(needle)) return i;
            }
        }

        return -1;
    }


    public static void main(String[] args) {
        _28_Implement_strStr iss = new _28_Implement_strStr();

        String str1_1 = "hello";
        String str1_2 = "ll";
        int results1 = iss.strStr(str1_1, str1_2);
        int expected1 = 2;

        String str2_1 = "aaaaa";
        String str2_2 = "bba";
        int results2 = iss.strStr(str2_1, str2_2);
        int expected2 = -1;

        String str3_1 = "";
        String str3_2 = "";
        int results3 = iss.strStr(str3_1, str3_2);
        int expected3 = 0;

        String str4_1 = "mississippi";
        String str4_2 = "issip";
        int results4 = iss.strStr(str4_1, str4_2);
        int expected4 = 4;

        String str5_1 = "mississippi";
        String str5_2 = "issipi";
        int results5 = iss.strStr(str5_1, str5_2);
        int expected5 = -1;

        System.out.println(results1 == expected1);
        System.out.println(results2 == expected2);
        System.out.println(results3 == expected3);
        System.out.println(results4 == expected4);
        System.out.println(results5 == expected5);
    }
}
