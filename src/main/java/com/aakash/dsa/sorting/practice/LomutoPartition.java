package com.aakash.dsa.sorting.practice;

import java.util.Arrays;

public class LomutoPartition {
    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        System.out.println(lumotoPartition(arr, 0, arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }

    public static int lumotoPartition(int[] arr, int low, int high){
        int pivot = arr[high]; // choose the last element as pivot
        int i = low - 1;  // choose the window for smaller elements than window

        for (int j = 0; j < high; j++) {
            if (arr[j] <= pivot){
                i++;
                swap(arr, j, i);
            }
        }

        swap(arr, i + 1, high); // To put the pivot in correct position

        return i + 1;
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
