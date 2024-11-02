package com.aakash.dsa.search.instrcution;

import java.util.Arrays;

public class TwoSumInSortedArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 15;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(twoSumV2(arr, target)));
    }

    public static int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
        // TC : O(n^2)
        // AS : O(1)
    }

    public static int[] twoSumV2(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] + arr[end] == target) {
                return new int[]{start, end};
            } else if (arr[start] + arr[end] < target) {
                start++;
            } else {
                end--;
            }
        }

        return new int[]{};
        // TC : O(n)
        // AS : O(1)
    }


}
