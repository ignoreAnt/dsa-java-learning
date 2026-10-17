package com.aakash.dsa.sorting.practise;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, 7, 5};
        //int[] arr = new int[]{1}; // 1 element
        //int[] arr = new int[]{}; // empty
        //int[] arr = null; // null
        System.out.println("Before Sorting:: " + Arrays.toString(arr));
        if (arr == null) System.out.println("Invalid Array");
        else {
            mergeSort(arr, 0, arr.length - 1);
        }
        System.out.println("After Sorting:: " + Arrays.toString(arr));

    }


    static void mergeSort(int[] arr, int left, int right) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        if (arr.length == 1) {
            return;
        }
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }


    }

    static void merge(int[] arr, int left, int mid, int right) {
        int leftArrayLen = mid - left + 1;
        int rightArrayLen = right - mid;
        int[] rightArray = new int[rightArrayLen];
        int[] leftArray = new int[leftArrayLen];

        // Prepare the left Array and copy elements from left position
/*        for (int i = 0; i < leftArrayLen; i++)
            leftArray[i] = arr[left + i];*/
        System.arraycopy(arr, left, leftArray, 0, leftArrayLen);
        //Prepare the right Array and copy elements from mid +i position
/*        for (int i = 0; i < rightArrayLen; i++)
            rightArray[i] = arr[mid + 1 + i];*/
        System.arraycopy(arr, mid + 1, rightArray, 0, rightArrayLen);
        int i = 0, j = 0, k = left;
        // initialize k as left to avoid overriding
        while (i < leftArrayLen && j < rightArrayLen) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }

        //copy rest of the elements from Left Array
        while (i < leftArrayLen) {
            arr[k++] = leftArray[i++];
        }
        //copy rest of the elements from Right Array
        while (j < rightArrayLen) {
            arr[k++] = rightArray[j++];
        }
    }
}
