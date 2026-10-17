package com.aakash.dsa.sorting.practise;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr=null;
      //  int[] arr=new int[0];
        //int[] arr = new int[]{5, 3, 8, 6, 2, 7, 4, 1};
       // int[] arr = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8};
       // int[] arr = new int[]{ 8, 7 , 6, 5, 4, 3, 2, 1};
        if(arr == null ){
            System.out.println("Invalid Array");
            throw new IllegalArgumentException("Invalid Array");
        }
        System.out.println("Array before sorting " + Arrays.toString(arr));
       // quickSortLumoto(arr,0,arr.length-1);
        quickSortHoare(arr, 0, arr.length - 1);
        System.out.println("Array after sorting" + Arrays.toString(arr));
    }

    private static void quickSortLumoto(int[] arr, int low, int high) {
        if(arr.length==0){
            System.out.println("Empty Array");
            return;
        }
        if(arr.length==1){
            return;
        }
        if (low < high) {
            int partitionIndex = lomutoPartition(arr, low, high);
            if(partitionIndex == high){
                // array is sorted
                System.out.println("Array is sorted in ascending order");
                return;
            }
            if(partitionIndex == 0){
                // array is sorted
                System.out.println("Array is sorted in descending order");
                return;
            }
            quickSortLumoto(arr, low, partitionIndex - 1);
            quickSortLumoto(arr, partitionIndex + 1, high);
        }
    }

    private static void quickSortHoare(int[] arr, int low, int high) {
        if(arr.length==0){
            System.out.println("Empty Array");
            return;
        }
        if(arr.length==1){
            return;
        }
        if (low < high) {
            int partitionIndex = hoarePartition(arr, low, high);
            if(partitionIndex == arr.length){
                System.out.println("Arrays sorted in ascending order");
                return;
            }
            if(partitionIndex == 0){
                System.out.println("Arrays sorted in descending order");
                return;
            }
            // In hoare Pivot may not be in its final sorted place.
            quickSortHoare(arr, low, partitionIndex);
            quickSortHoare(arr, partitionIndex + 1, high);
        }
    }

    private static int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high]; // pivot as last element
        int i = low - 1; // start from outside window
        for (int j = low; j < high; j++) {
            if (arr[j] <=  pivot) { // smaller element found
                i++;   //increase the window size
                swap(arr, i, j);
            }
        }
        //place pivot at the right position
        if(i != -1) // no smaller element found, i = -1
            swap(arr, high, i + 1);
        return i + 1;
    }

    private static int hoarePartition(int[] arr, int low, int high) {
        int pivot = arr[low];  // Choose first element as pivot
        int i = low - 1, j = high + 1;
        while (true) {
            do {
                i++;
            } while (i < arr.length && arr[i] >= pivot);
            // i<arr.length to handle array index out of bound exception
            // when array is sorted  i will be array size
            if (i == arr.length) {
                return i; //reached last index indicates array is sorted
            }
            do {
                j--;
            } while (arr[j] < pivot);
            if (i >= j) {
                //termination condition  Pointers have crossed, return partition index
                return j;
            }
            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int[] arr, int low, int high) {
        int[] temp = new int[high - low + 1];
        int pivot = arr[high];
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
        for (int i = 0; i < temp.length; i++) {
            System.out.println(Arrays.toString(arr));
        }
        return pivot;
    }
}