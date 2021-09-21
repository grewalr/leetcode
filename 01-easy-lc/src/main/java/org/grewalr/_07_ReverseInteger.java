package org.grewalr;

public class _07_ReverseInteger {

    public int reverse(int x) {
        String reversed = new StringBuilder().append(Math.abs(x)).reverse().toString();

        try {
            return (x < 0) ? -1 * Integer.parseInt(reversed) : Integer.parseInt(reversed);
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public int reverse_solution(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;

            // Integer.MAX_VALUE is 2147483647 hence the last digit '7' for pop
            // is check for overflow
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;

            // Integer.MIN_VALUE is -2147483648 hence the last digit '-8' for pop
            // is the check for overflow
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;

            rev = rev * 10 + pop;
        }
        return rev;
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
