package org.grewalr;

import java.util.List;

public class _2_AddTwoNumbers {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public ListNode addTwoNumbers_solution(ListNode l1, ListNode l2) {
        // 1 -> 5 -> 1
        // 3 -> 6 -> 7
        // 4 -> 1 -> 9
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int l1Val = (p1 != null) ? p1.val : 0;
            int l2Val = (p2 != null) ? p2.val : 0;

            int sum = carry + l1Val + l2Val;
            int newSum = sum % 10;
            carry = sum / 10;
            current.next = new ListNode(newSum);

            // Advance to next
            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }

        if (carry > 0) current.next = new ListNode(carry);

        return dummyHead.next;
    }


    public static void main(String[] args) {
        _2_AddTwoNumbers addTwoNumbers = new _2_AddTwoNumbers();





    }
}
