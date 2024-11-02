package com.aakash.dsa.search.instrcution;

public class TripleSumInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10};
        int X = 12;
        System.out.println(tripletWithSum(arr, X));
        System.out.println(tripletWithSumV2(arr, X));
    }

    private static boolean tripletWithSum(int[] arr, int x) {
        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean tripletWithSumV2(int[] arr, int x) {
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                if (arr[i] + arr[left] + arr[right] == x) {
                    return true;
                } else if (arr[i] + arr[left] + arr[right] < x) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;
    }
}
