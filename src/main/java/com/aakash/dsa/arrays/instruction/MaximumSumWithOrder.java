package com.aakash.dsa.arrays.instruction;

public class MaximumSumWithOrder {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(maxValue(arr));
        System.out.println(maxValueV2(arr));
    }

    /*
        find all the pairs
        compute difference of each pair
        find the max among those
     */
    public static int maxValue(int[] arr){
        int result = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                result = Math.max(result, arr[j] - arr[i]);
            }
        }

        return result;
        // TC : O(n^2)
        // AS : O(1)
    }

    // Compute the difference of first pair call it maxDifference
    // Assign the minimumValue to first element
    // Traverse the array from left to right (start to end)
    // compute the maxDifference with minimumValue
    // if it is more than already compute maxDifference update maxDifference with current value
    // also keep updating the minimum value if a lower value element encountered
    public static int maxValueV2(int[] arr){
        int result = arr[1] - arr[0];
        int minimumValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = Math.max(result, arr[i] - minimumValue);
            minimumValue = Math.min(minimumValue, arr[i]);
        }

        return result;
    }
}
