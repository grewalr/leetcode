package org.grewalr;

public class _07_ReverseInteger {

    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) isNegative = true;

        char[] xStr = String.valueOf(x).toCharArray();

        for (int i = 0; i < xStr.length; i++) {
            char 
        }

    }


    public static void main(String[] args) {
        _07_ReverseInteger ri = new _07_ReverseInteger();

        int a = ri.reverse(123);
        System.out.println(a);

        int b = ri.reverse(-123);
        System.out.println(b);

        int c = ri.reverse(120);
        System.out.println(c);

        int d = ri.reverse(0);
        System.out.println(d);
    }
}
