package com.aakash.dsa.arrays.Practise;

public class MaxSumOfKConsecutiveElements {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, 1, 2, 9};
        int k = 3;
        System.out.println(maxSumOfKConsecutiveElements(arr, k));
        System.out.println(maxSumOfKConsecutiveElementsV2(arr, k));

    }

    public static int maxSumOfKConsecutiveElements(int[] arr, int k) {
        int maxSum = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            int currentSum = 0;
            for (int j = i; j < i + k; j++) {
                currentSum += arr[j];
            }

            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;

        // TC : O(n^2)
        // AS : O(1)
    }

    public static int maxSumOfKConsecutiveElementsV2(int[] arr, int k) {
        // Let first set of sum as MaxSum
        // Let currentSum = maxSum
        // move to index 1 and
        // to find next sum.. Subtract FirstElement from LastSum and add next element
        // compare the currentSum and MaxSum to find the max consecutive number
        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        int maxSum = 0;
        maxSum = currentSum;
        for (int i = 0; i < arr.length - k; i++) {
            currentSum = currentSum - arr[i] + arr[k + i];
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
