package org.grewalr;

public class _26_RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        int j = 1;

        // Assume always 1 distinct element as array length
        // is greater than 0
        int numDistinctElems = 1;

        while (j < nums.length) {
            int currentVal = nums[i];
            int nextVal = nums[j];

            if (nextVal != currentVal) {
                nums[++i] = nums[j];
                numDistinctElems++;
            }
            j++;
        }

        return numDistinctElems;
    }

    public int removeDuplicates_solution(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }


    public static void main(String[] args) {
        _26_RemoveDuplicatesFromSortedArray vp = new _26_RemoveDuplicatesFromSortedArray();

        int[] nums1 = {1, 1, 2};
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = vp.removeDuplicates(nums2); // Calls your implementation

//        System.out.println(k == expectedNums.length);

        for (int i = 0; i < k; i++) {
            System.out.print(", " + nums2[i]);
//            System.out.println(nums1[i] == expectedNums[i]);
        }

//        System.out.println();
//        for (int i = 0; i < k; i++) {
//            System.out.print(", " + expectedNums[i]);
//        }


    }
}
