package org.grewalr;

public class _21_MergeTwoSortedLists {

    // Recursion example
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

    // NOT WORKING!!!!
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Recursion to get l1 value and l2 value
        // base case if l1 == null and l2 == null return new ListNode()
        // base case if l2 == null then
        // Check l1 value against l2
        // if l1.val > l2.val then l1.val else l2.val

        if (l1 == null && l2 == null) return new ListNode();
        if (l1.val > l2.val) return new ListNode(
                l2.val,
                new ListNode(l1.val, mergeTwoLists(l1.next, l2.next)));
        else if (l2.val > l1.val) return new ListNode(
                l1.val,
                new ListNode(l2.val, mergeTwoLists(l1.next, l2.next)));
        else
            return new ListNode(
                    l1.val,
                    new ListNode(l2.val, mergeTwoLists(l1.next, l2.next)));
    }

    public ListNode mergeTwoLists_solution(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;

        else if (l2 == null) return l1;

        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists_solution(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists_solution(l2.next, l1);
            return l2;
        }
    }


    public static void main(String[] args) {
        _21_MergeTwoSortedLists vp = new _21_MergeTwoSortedLists();

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode results1 = vp.mergeTwoLists_solution(l1, l2);
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
        System.out.println(result1.equals(results1));

        ListNode l3 = new ListNode();
        ListNode l4 = new ListNode();
        ListNode results2 = vp.mergeTwoLists_solution(l3, l4);
        ListNode result2 = new ListNode();
        System.out.println(result2.equals(results2));

        ListNode l5 = new ListNode();
        ListNode l6 = new ListNode(0);
        ListNode results3 = vp.mergeTwoLists_solution(l5, l6);
        ListNode result3 = new ListNode(0);
        System.out.println(result3.equals(results3));
    }
}
