package com.aakash.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxMinArray {
    public static void main(String[] args) {
        System.out.println(max(new int[]{-1, -2, -3, -56, -109, -3, -4, -5, -13}));
        System.out.println(min(new int[]{-1, -2, -3, -56, -109, -3, -4, -5, -13}));
    }

    public static int max(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("null or zero length array was passed");
        }
        // Missed out
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }

        return max;
    }

    public static int min(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("null or zero length array was passed");
        }
        int min = Integer.MAX_VALUE; // Missed out
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    public static int secondMaxElement(int[] arr){
        // Approach 1: Sort & get the nth index; Best sorting algorithm has TC of O(n* log(n))

        return -1;
    }

    public static int secondMinElement(int[] arr){
        // Approach 1: Sort & get the nth index; Best sorting algorithm has TC of O(n* log(n))
        Arrays.sort(arr);

        return -1;
    }
    public static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }

        return -1;
    }

    public static List<Integer> searchAllOccurances(int[] arr, int target){
        List<Integer> indices = new ArrayList<>();
        return indices;
    }
}
