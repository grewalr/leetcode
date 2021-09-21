package org.grewalr;

public class _27_RemoveElement {

    // This solution was copied
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public int removeElement_solution(int[] nums, int val) {
        return 0;
    }


    public static void main(String[] args) {
        _27_RemoveElement re = new _27_RemoveElement();

        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;

        int results1 = re.removeElement(nums1, val1);
        int[] expectedNums1 = {2, 2};
        int expectedResults1 = 2;

        System.out.println(results1 == expectedResults1);
        System.out.println(expectedResults1 == expectedNums1.length);

// =============================================================

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;

        int results2 = re.removeElement(nums2, val2);
        int[] expectedNums2 = {0, 1, 4, 0, 3};
        int expectedResults2 = 5;

        System.out.println(results2 == expectedResults2);
        System.out.println(expectedResults2 == expectedNums2.length);
    }
}
