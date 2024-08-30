package com.aakash.dsa.arrays.instruction;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int[] arr = {3, 4, 8, -9, 20, 6};
        System.out.println(equilibriumPoint(arr));
        int[] prefixSum = getPrefixSum(arr);
        int[] suffixSum = getSuffixSum(arr);
        System.out.println(equilibriumPointV2(arr, prefixSum, suffixSum));
        System.out.println(equilibriumPointV3(arr));
    }

    private static int equilibriumPoint(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // O(n)
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) { // O(n)
                leftSum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) { // O(n)
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
        // TC : O(n) * O(2n) = O(n^2)
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

    public static int[] getSuffixSum(int[] arr){
        int[] suffixSum = new int[arr.length];
        suffixSum[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }

        return suffixSum;
    }

    public static int equilibriumPointV2(int[] arr, int[] prefixSum, int[] suffixSum){
        for (int i = 0; i < arr.length; i++) {
            if (prefixSum[i] == suffixSum[i]){
                return i;
            }
        }
        return -1;
        // TC : O(n)
        // AS : O(2n)
    }

    public static int equilibriumPointV3(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;

        // TC : O(n)
        // AS : O(1)
    }
}
