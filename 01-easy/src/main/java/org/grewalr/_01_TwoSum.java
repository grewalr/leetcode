package org.grewalr;

import java.util.HashMap;
import java.util.Map;

public class _01_TwoSum {

    // Attempted
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> operandMap = new HashMap<>();

        // Populate hashmap
        for (int i = 0; i < nums.length; i++) {
            operandMap.put(nums[i], i); // O(n) -- TC
        }

        for (int i = 0; i < nums.length; i++) {
            int correspondingOperand = target - nums[i];

            if (operandMap.get(correspondingOperand) != null) {
                int oprIdx = operandMap.get(correspondingOperand);

                // The same number cannot be used twice hence check if
                // the index is not the same
                if (oprIdx != i) {
                    return new int[]{i, operandMap.get(correspondingOperand)};
                }
            }

        }

        return null;
    }

    // Optimal Solution - One pass hash table
    // Time: O(n)
    // Space: O(n)
    public int[] twoSum_solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        // In case there is no solution, we'll just return null
        return null;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] output1 = {0, 1};

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] output2 = {1, 2};

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] output3 = {0, 1};

        _01_TwoSum ts = new _01_TwoSum();
        int[] arr1 = ts.twoSum(nums1, target1);
        int[] arr2 = ts.twoSum(nums2, target2);
        int[] arr3 = ts.twoSum(nums3, target3);

        for (int x : arr1) {
            System.out.print(x);
        }
        System.out.println();
        for (int x : arr2) {
            System.out.print(x);
        }
        System.out.println();
        for (int x : arr3) {
            System.out.print(x);
        }

    }
}
