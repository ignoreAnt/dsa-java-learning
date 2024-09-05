package com.aakash.dsa.arrays.instruction;

public class CountOccurrenceInSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 40};
        System.out.println(countOccurrence(arr, 30));
        System.out.println(countOccurrenceV2(arr, 30));
    }

    private static int countOccurrenceV2(int[] arr, int target) {
        int firstOccurrence = FirstOccurrenceOfInSortedArray.firstOccurrenceV2(arr, target);
        int lastOccurrence = LastOccurrenceInSortedArray.lastOccurrenceV2(arr, target);
        if (firstOccurrence == -1 || lastOccurrence == -1){
            return 0;
        }
        return lastOccurrence - firstOccurrence + 1;
    }

    private static int countOccurrence(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                count++;
            }
        }
        return count;
    }
}
