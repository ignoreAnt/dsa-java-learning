package com.aakash.dsa.arrays.instruction;

public class RangeQueries {
    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 9, 6, 5};
        System.out.println(getSum(arr, 1, 3));
        System.out.println(getSum(arr, 0, 2));
        int[] prefixSum = getPrefixSum(arr);
        System.out.println(getSumV2(prefixSum, 1, 3));
        System.out.println(getSumV2(prefixSum, 0, 2));
    }

    public static int getSum(int[] arr, int left, int right){
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += arr[i];
        }

        return sum;
        // TC : O(n)
        // AS : O(1)
    }

    public static int[] getPrefixSum(int[] arr){
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum;
    }

    public static int getSumV2(int[] prefixSum, int left, int right){
        if (left == 0){
            return prefixSum[right];
        }
        return prefixSum[right] - prefixSum[left - 1];
    }
}
