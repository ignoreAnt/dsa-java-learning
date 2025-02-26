package com.aakash.dsa.sorting.practice;

import java.util.Arrays;

public class HoaresPartition {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        int[] reverseSorted = {5, 4, 3, 2, 1};
        System.out.println(hoaresPartition(arr, 0, arr.length - 1));
        System.out.println(Arrays.toString(arr));

        // {5, 4, 3, 2, 1} - reverse sorted
        System.out.println(Arrays.toString(reverseSorted));
        System.out.println(hoaresPartition(reverseSorted, 0, arr.length - 1));
    }

    public static int hoaresPartition(int[] arr, int low, int high){
        // choose the pivot as first index
        int pivot = arr[low];
        // initialize the pointers
        int leftIndex = low - 1;
        int rightIndex = high + 1;


        while (leftIndex < rightIndex) {
            do {
                leftIndex++;
            } while (arr[leftIndex] < pivot);

            do {
                rightIndex--;
            } while (arr[rightIndex] > pivot);

            if (leftIndex >= rightIndex) {
                break;
            }

                int temp = arr[leftIndex];
                arr[leftIndex] = arr[rightIndex];
                arr[rightIndex] = temp;
            }


        return rightIndex;
    }
}
