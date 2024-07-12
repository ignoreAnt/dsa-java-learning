package com.aakash.dsa.arrays.instruction;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(reverse(nums)));
        reverseV2(nums);
        System.out.println(Arrays.toString(nums));
        /*
                Test cases :
                1) array is null.
                2) array has zero length.
                3) check for negative numbers.
                4) check for single element array.
                5) check for all the elements in the array are same.
                6) check for duplicate elements.
         */
    }

    public static int[] reverse(int[] arr){
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0 ; i--) {
            temp[j++] = arr[i];
        }

        arr = temp;

        return  arr;

        // TC : O(n)
        // AS : O(n)
    }

    public static void reverseV2(int[] arr){
        if (arr == null){
            throw new IllegalArgumentException("Array is null");
        }

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }

        // TC : O(n)
        // AS : O(1)
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
