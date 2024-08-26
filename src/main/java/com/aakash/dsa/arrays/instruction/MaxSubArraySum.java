package com.aakash.dsa.arrays.instruction;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {2, 3, -8, 7 , -1, 2, 3};
//        int[] nums = {1, 2, 3};
        System.out.println(maxSubArraySum(nums));
        System.out.println(maxSubArraySumV2(nums));
    }

    public static int maxSubArraySum(int[] arr){
        int maxSum = 0;

        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;
            for (int end = start; end < arr.length; end++) {
//                for (int i = start; i <= end; i++) {
                currentSum += arr[end];
//                    System.out.print(arr[i] + " ");
//                }
                maxSum = Math.max(maxSum, currentSum);
//              System.out.println();
            }
        }

        return maxSum;
    }

    public static int maxSubArraySumV2(int[] arr){
        int maxSoFar = arr[0];
        int maxEnding = arr[0];

        for (int i = 0; i < arr.length; i++) {
            maxEnding = Math.max(arr[i], maxEnding + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }

        return maxSoFar;

        // TC : O(n)
        // AS : O(1)
    }
}
