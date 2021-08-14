package org.grewalr;

// https://leetcode.com/problems/reverse-integer

public class _09_PalindromeNumber {

    // NOTES:
    // 1) To get the last digit of an integer, modulo by 10 e.g. 121 % 10 = 1
    // 2) To remove the last digit of an integer, divide it by 10 e.g. 121 / 10 = 12
    // 3) To accumulate the digits removed from step 2 multiply the accumulated value by 10
    //    then add value in step 1 e.g. accum = accum * 10 + 1

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int reversed = 0;
            int copyX = x;

            while (copyX != 0) {
                int pop = copyX % 10;
                copyX = copyX / 10;

                // Overflow check
                if (copyX > Integer.MAX_VALUE || (copyX == Integer.MAX_VALUE && pop > 7)) return false;
                if (copyX < Integer.MIN_VALUE || (copyX == Integer.MIN_VALUE && pop < -8)) return false;

                reversed = reversed * 10 + pop;
            }

            if (reversed != x) return false;

            return true;
        }

    }

    public boolean isPalindrome_solution(int x) {
        // Special cases:
        // As discussed, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }







        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome (it will always equal to itself),
        // we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber / 10;
    }

    public static void main(String[] args) {
        _09_PalindromeNumber pn = new _09_PalindromeNumber();

        boolean a = pn.isPalindrome(121);
        System.out.println(a);

        boolean b = pn.isPalindrome(-121);
        System.out.println(b);

        boolean c = pn.isPalindrome(120021);
        System.out.println(c);

        boolean d = pn.isPalindrome(10);
        System.out.println(d);
    }
}
