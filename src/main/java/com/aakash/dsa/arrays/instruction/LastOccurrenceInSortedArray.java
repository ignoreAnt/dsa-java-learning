package com.aakash.dsa.arrays.instruction;

public class LastOccurrenceInSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 40};
        System.out.println(lastOccurrence(arr, 30));
        System.out.println(lastOccurrenceV2(arr, 30));
    }

    public static int lastOccurrence(int[] arr, int target) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target){
                return i;
            }
        }
        return  -1;
    }

    public static int lastOccurrenceV2(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start)/ 2;
            if(arr[mid] < target){
                start = mid + 1;
            }else if (arr[mid] > target){
                end = mid - 1;
            }else{
                if (mid == arr.length - 1 || arr[mid + 1] != target){
                    return mid;
                }else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
