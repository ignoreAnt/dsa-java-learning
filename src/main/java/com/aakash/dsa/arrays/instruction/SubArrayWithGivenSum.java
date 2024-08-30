package com.aakash.dsa.arrays.instruction;

import java.util.Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 21;
        System.out.println(Arrays.toString(isSubArrayWithGivenSum(arr, sum)));
        System.out.println(isSubArrayWithGivenSumV2(arr, sum));
    }

    public static int[] isSubArrayWithGivenSum(int[] arr, int sum){

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == sum){
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
        // TC : O(n^2)
        // AS : O(1)
    }

    public static boolean isSubArrayWithGivenSumV2(int[] arr, int target){
        int currentSum = arr[0];
        int start = 0;

        for (int end = 1; end <= arr.length; end++) {
            // If currentSum exceeds the sum, then remove the starting elements
            while (currentSum > target && start < end - 1){
                currentSum -= arr[start];
                start++;
            }
            // If currentSum becomes equal to sum, then return true
            if (currentSum == target){
                return true;
            }

            // Add this element to currentSum
            if (end < arr.length){
                currentSum += arr[end];
            }
        }

        return false;
    }
}
