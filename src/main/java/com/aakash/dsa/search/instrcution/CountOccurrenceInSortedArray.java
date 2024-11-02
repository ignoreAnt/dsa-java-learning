package com.aakash.dsa.search.instrcution;

public class CountOccurrenceInSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 40};
        System.out.println(countOccurrence(arr, 30));
        System.out.println(countOccurrenceV2(arr, 30));
    }

    private static int countOccurrenceV2(int[] arr, int target) {
        int firstOccurrence = FirstOccurrenceOfInSortedArray.firstOccurrenceV2(arr, target); //O(log n)
        int lastOccurrence = LastOccurrenceInSortedArray.lastOccurrenceV2(arr, target); //O(log n)
        if (firstOccurrence == -1 || lastOccurrence == -1){
            return 0;
        }
        return lastOccurrence - firstOccurrence + 1;

        // TC : O(log n) = O(log n) + O(log n) = O(2 * log(n))
        // AS : O(1)
    }

    private static int countOccurrence(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                count++;
            }
        }
        return count;

        // TC : O(n)
        // AS : O(1)
    }
}
