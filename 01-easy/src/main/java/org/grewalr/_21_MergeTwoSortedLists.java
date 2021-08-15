package org.grewalr;

public class _21_MergeTwoSortedLists {

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


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        return new ListNode();
    }


    public static void main(String[] args) {
        _21_MergeTwoSortedLists vp = new _21_MergeTwoSortedLists();

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode result1 =
                new ListNode(1,
                        new ListNode(1,
                                new ListNode(2,
                                        new ListNode(3,
                                                new ListNode(4,
                                                        new ListNode(4)
                                                )
                                        )
                                )
                        )
                );

        ListNode l3 = new ListNode();
        ListNode l4 = new ListNode();
        ListNode result2 = new ListNode();

        ListNode l5 = new ListNode();
        ListNode l6 = new ListNode(0);
        ListNode result3 = new ListNode(0);
    }
}
