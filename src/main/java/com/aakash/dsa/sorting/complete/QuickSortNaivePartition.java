package com.aakash.dsa.sorting.complete;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class QuickSortNaivePartition {

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70, 30}; // sorted : {10, 30, 30, 40, 50, 70, 80, 90}

        Arrays.sort(arr);

        Map<String, Integer> map = new HashMap<>();
        System.out.println("Original Array: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = naivePartition(arr, low, high);

            // Recursively sort elements before and after the pivot
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int naivePartition(int[] arr, int low, int high) {
        // Choose the last element as the pivot
        int pivot = arr[high];

        // Create a temporary array to hold elements during partitioning
        int[] temp = new int[high - low + 1];
        int index = 0;

        // Add elements smaller than the pivot to the temporary array
        for (int i = low; i <= high; i++) {
            if (arr[i] < pivot) {
                temp[index++] = arr[i];
            }
        }

        // Count the number of elements smaller than the pivot
        int pivotIndex = low + index;

        // Place the pivot element at its correct position in the temp array
        temp[index++] = pivot;

        // Add elements greater than or equal to the pivot to the temporary array
        for (int i = low; i <= high; i++) {
            if (arr[i] >= pivot && i != high) {
                temp[index++] = arr[i];
            }
        }

        // Copy the temp array back to the original array
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }

        return pivotIndex;
    }
}

