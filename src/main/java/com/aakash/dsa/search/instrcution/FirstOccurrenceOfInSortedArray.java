package com.aakash.dsa.search.instrcution;

public class FirstOccurrenceOfInSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 30, 30, 30, 30, 40};
        System.out.println(firstOccurrenceV2(arr, 30));
        System.out.println(firstOccurrence(arr, 30));
    }

    public static int firstOccurrence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return  -1;
        // TC : O(n)
        // AS : O(1)
    }

    public static int firstOccurrenceV2(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] < target){
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }else{
                if (mid == 0 || arr[mid - 1] != target){
                    return mid;
                }else{
                    end = mid - 1;
                }
            }
        }

        return -1;

        // TC : O(log n)
        // AS : O(1)
    }
}
