package com.aakash.dsa.sorting.complete;

import java.util.Arrays;

public class SortedArrayMerge {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2};

        int[] result = merge(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        // Initialize the result array
        int[] result = new int[arr1.length + arr2.length];

        // Initialize the indices
        int i = 0;  // index for arr1
        int j = 0;  // index for arr2
        int k = 0;  // index for result

        // Compare the elements of the two arrays,
        // and store the smaller element in the result array
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }else {
                result[k++] = arr2[j++];
            }
        }

        // Add the remaining elements of arr1
        while (i < arr1.length){
            result[k++] = arr1[i++];
        }

        // Add the remaining elements of arr2
        while (j < arr2.length){
            result[k++] = arr2[j++];
        }

        return result;
    }
}
