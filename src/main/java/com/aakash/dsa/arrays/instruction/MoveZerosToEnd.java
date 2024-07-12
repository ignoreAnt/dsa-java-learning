package com.aakash.dsa.arrays.instruction;

import java.util.Arrays;

/**
 * Problem 2 : Move Zeroes
 * Given an integer array nums, move all 0's (zeros) to the end of the array while maintaining the relative order of
 * all other elements.
 *
 * Constraints:
 * 1 <= nums.length <= 10^5
 * -100 <= nums[i] <= 100
 * You must modify the array in-place without creating a copy.
 *
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 * Input: nums = [1,0,1]
 * Output: [1,1,0]
 * Explanation:
 * For both examples, the relative order of non-zero elements is maintained,
 * and all zeros are moved to the end of the array.
 */
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(nums));
        removeZerosToEnd(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void removeZerosToEnd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != 0){
                        swap(i, j, arr);
                        break;
                    }
                }
            }
        }
    }

    public static void removeZerosToEndV2(int[] arr){
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                swap(i, nonZeroIndex, arr);
                nonZeroIndex++;
            }
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
