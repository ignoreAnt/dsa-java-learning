package com.aakash.dsa.sorting.complete;

import java.util.Arrays;

public class NaivePartition {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70, 30}; // sorted : {10, 30, 30, 40, 50, 70, 80, 90}

        naivePartition(arr, 0, arr.length - 1, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }


    public static void naivePartition(int[] arr, int low, int high, int pivotIndex) {
        int[] temp = new int[high - low + 1];
        int pivot = arr[pivotIndex];
        int index = 0;

        // First pass: Collect elements <= pivot
        for (int i = low; i <= high; i++) {
            if (arr[i] <= pivot) {
                temp[index++] = arr[i];
            }
        }

        // Second pass: Collect elements > pivot
        for (int i = low; i <= high; i++) {
            if (arr[i] > pivot) {
                temp[index++] = arr[i];
            }
        }

        // Copy temp back to arr
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }
}
