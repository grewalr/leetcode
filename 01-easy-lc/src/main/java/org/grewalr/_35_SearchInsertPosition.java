package org.grewalr;

import java.util.Arrays;

public class _35_SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) return 0;

        // 2 pointers
        int i = 0;
        int j = nums.length -1;

        while (i <= j) {
            int mid = (i + j) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                i = mid + 1;
            } else if (target < nums[mid]) {
                j = mid - 1;
            }
        }

        return i;
    }


    public static void main(String[] args) {
        _35_SearchInsertPosition sip = new _35_SearchInsertPosition();

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int results1 = sip.searchInsert(nums1, target1);
        int expected1 = 2;

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;
        int results2 = sip.searchInsert(nums2, target2);
        int expected2 = 1;

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;
        int results3 = sip.searchInsert(nums3, target3);
        int expected3 = 4;

        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;
        int results4 = sip.searchInsert(nums4, target4);
        int expected4 = 0;

        int[] nums5 = {1};
        int target5 = 0;
        int results5 = sip.searchInsert(nums5, target5);
        int expected5 = 0;


        System.out.println(results1 == expected1);
        System.out.println(results2 == expected2);
        System.out.println(results3 == expected3);
        System.out.println(results4 == expected4);
        System.out.println(results5 == expected5);
    }
}
