package org.grewalr;

import java.io.IOException;

class RepeatedString {

    public static long repeatedString(String s, long n) {
        long repeatChars = n / s.length();
        long remainder = n % s.length();

        // Find out how many 'a's in string
        long numberOfAChars = 0L;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') numberOfAChars++;
        }
        long total = numberOfAChars * repeatChars;

        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') total++;
        }

        return total;
    }

    public static void main(String[] args) throws IOException {
        long result1 = RepeatedString.repeatedString("abcac", 10L); //abcdaabcda
        long result2 = RepeatedString.repeatedString("aba", 10L); //abcdaabcda
        long result3 = RepeatedString.repeatedString("a", 1000000000000L); //abcdaabcda
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}

