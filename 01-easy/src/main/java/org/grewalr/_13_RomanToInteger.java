package org.grewalr;

import java.util.HashMap;
import java.util.Map;

public class _13_RomanToInteger {

    // NOTES:
    // If it is GUARANTEED that the input is in a range [ 0 -> n ] then the
    // rate of growth is considered constant i.e. time complexity is O(1)

    static Map<Character, Integer> romanToIntMap = new HashMap<>();

    static {
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        int accumulatedNum = 0;
        int prevInt = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentIntVal = romanToIntMap.get(s.charAt(i));

            if (currentIntVal > accumulatedNum || prevInt == currentIntVal) {
                accumulatedNum += currentIntVal;
            } else {
                accumulatedNum -= currentIntVal;
            }

            prevInt = currentIntVal;
        }

        return accumulatedNum;
    }

    public static void main(String[] args) throws Exception {
        _13_RomanToInteger rti = new _13_RomanToInteger();

        int a1 = rti.romanToInt("II");
        System.out.println(a1 == 2);

        int a = rti.romanToInt("III");
        System.out.println(a == 3);

        int b = rti.romanToInt("IV");
        System.out.println(b == 4);

        int c = rti.romanToInt("IX");
        System.out.println(c == 9);

        int d = rti.romanToInt("LVIII");
        System.out.println(d == 58);

        int e = rti.romanToInt("MCMXCIV");
        System.out.println(e == 1994);

        int f = rti.romanToInt("DXCI");
        System.out.println(f == 591);
    }
}
