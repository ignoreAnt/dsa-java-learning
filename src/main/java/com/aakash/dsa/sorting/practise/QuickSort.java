package com.aakash.dsa.sorting.practise;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6,11, 8, 10, 1, 5,2,9, 1};
        int pivotIndex=3;
        System.out.println("Array before sorting " + Arrays.toString(arr));
        System.out.println("Partition Index " +pivotIndex);
        //sortWithPartitionV1(arr, 0, arr.length - 1, pivotIndex);
        quickSortWithOutRecursion(arr, 0, arr.length - 1, pivotIndex);
        System.out.println("Array after sorting" + Arrays.toString(arr));
    }

    private static void quickSortWithOutRecursion(int[] arr, int low, int high, int pivotIndex) {
        int[] newArr = new int[high - low + 1];
        int pivot = arr[pivotIndex];
        int newArrIndx = 0;
      /*  int lowIndex=low;
        int highIndex =high-low;*/
        //element < pivot
        for (int i = low; i <= high; i++) {
            if (arr[i] < pivot) {
                newArr[newArrIndx++] = arr[i];
            }
        }
        //Place the pivot at right position
        newArr[newArrIndx++] = arr[pivotIndex];
        //element > pivot
        for (int i = low; i <= high; i++) {
            if (arr[i] > pivot) {
                newArr[newArrIndx++] = arr[i];
            }
        }
        System.arraycopy(newArr, 0, arr, low, newArr.length);

    }


}
