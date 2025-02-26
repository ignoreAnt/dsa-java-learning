package com.aakash.dsa.sorting.complete;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] unsorted = {10, 15, 20, 40, 8, 11, 15, 22, 25};
        mergeSort(unsorted, 0, unsorted.length - 1);
        System.out.println(Arrays.toString(unsorted));

    }

    public static void mergeSort(int[] arr, int left, int right){
        if (left < right){
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int leftArrayLength = mid - left + 1;
        int rightArrayLength = right - mid;
        int[] leftArray = new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];

        for (int i = 0; i < leftArrayLength; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int i = 0; i < rightArrayLength; i++) {
            rightArray[i] = arr[mid + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;
        while (i < leftArrayLength && j < rightArrayLength){
            if (leftArray[i] <= rightArray[j]){
                arr[k++] = leftArray[i++];
            }else if (leftArray[i] > rightArray[j]) {
                arr[k++] = rightArray[j++];
            }
        }

        while (i < leftArrayLength){
            arr[k++] = leftArray[i++];
        }

        while (j < rightArrayLength){
            arr[k++] = rightArray[j++];
        }
    }
}
