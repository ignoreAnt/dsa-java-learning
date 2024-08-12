package com.aakash.dsa.arrays.practise;

import java.util.Arrays;

public class Max1sSequence {
    /*    Step1
    - Initialize the CurrentCount = 0
                - Initialize the PreviousCount = 0
        Step 2  :
                - Iterate over the collection
    - Compare the elements in the collection.
        If the current element is 1 then
        Increment the CurrentCount by 1
                else
        compare CurrentCount > PreviousCount
                PreviousCount = CurrentCount
        CurrentCount = 0;

    - Step 3:
        Compare CurrentCount > PreviousCount
                max1sequence = CurrentCount
      else
        max1sequence = PreviousCount */
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        int[] nums1 = {1};
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        int max1Sequence = findMaxSequenceOfOne(nums);
        System.out.println("Num Array is "+ Arrays.toString(nums)+ ":: "+"max1Sequence is " + max1Sequence);
         max1Sequence = findMaxSequenceOfOne(nums1);
        System.out.println("Num Array is "+ Arrays.toString(nums1)+ ":: "+"max1Sequence is " + max1Sequence);
         max1Sequence = findMaxSequenceOfOne(nums2);
        System.out.println("Num Array is "+ Arrays.toString(nums2)+ ":: "+"max1Sequence is " + max1Sequence);
        max1Sequence = findMaxSequenceOfOne(new int[0]);
        System.out.println("Num Array is "+ Arrays.toString(nums2)+ ":: "+"max1Sequence is " + max1Sequence);

    }

    private static int findMaxSequenceOfOne(int[] nums) {
        if (nums == null || nums.length == 0)
            throw new IllegalArgumentException("Invalid Array");

        int currentCountofOne = 0, result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCountofOne++;
            } else {
                if (currentCountofOne > result) {
                    result = currentCountofOne;
                }
                currentCountofOne = 0;
            }
        }
        if (currentCountofOne > result) {
            result = currentCountofOne;
        }

        return result;
    }

}
