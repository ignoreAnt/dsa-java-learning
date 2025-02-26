package com.aakash.dsa.sorting.complete;

public class DifferenceOfTwoSortedSets {
    public static void main(String[] args) {

    }

    public static int[] difference(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null) {
            return null;
        }
        if (arr1.length == 0) {
            return new int[]{};
        }
        if (arr2.length == 0) {
            return arr1; // If B is empty, the result is A
        }

        int[] tempResult = new int[arr1.length]; // Temporary array for storing results
        int i = 0, j = 0, k = 0; // Pointers for arr1, arr2, and tempResult

        while (i < arr1.length) {
            if (j >= arr2.length || arr1[i] < arr2[j]) {
                // Add to result if arr1[i] is not in arr2 or arr2 is fully traversed
                if (k == 0 || tempResult[k - 1] != arr1[i]) { // Avoid duplicates
                    tempResult[k++] = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                // Move pointer in arr2
                j++;
            } else {
                // arr1[i] == arr2[j], skip this element
                i++;
                j++;
            }
        }

        // Trim the temporary array to the actual size
        int[] result = new int[k];
        System.arraycopy(tempResult, 0, result, 0, k);
        return result;
    }

}
