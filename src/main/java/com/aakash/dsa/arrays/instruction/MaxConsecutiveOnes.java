package com.aakash.dsa.arrays.instruction;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Maximum Consecutive 1s: " + solution.findMaxConsecutiveOnes(nums1)); // Output: 3

        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Maximum Consecutive 1s: " + solution.findMaxConsecutiveOnes(nums2)); // Output: 2
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}
