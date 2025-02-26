package com.aakash.dsa.sorting.complete;

/**
 * Count Inversions in an Array
 * 1️⃣ Problem Statement
 * 🔹 Definition
 * An inversion in an array arr is a pair (arr[i], arr[j]) where:
 * <p>
 * i < j (left index appears before right index)
 * arr[i] > arr[j] (greater element appears before a smaller element)
 * <p>
 * The goal is to count the total number of such inversions in the given array.
 * 🔹 Example Problems
 * 1️⃣ Example 1
 * <p>
 * Input: [2, 4, 1, 3, 5]
 * Process:
 * Inversion pairs: (4,1), (4,3), (2,1)
 * Total inversions = 3
 * Output: 3
 * <p>
 * 2️⃣ Example 2
 * <p>
 * Input: [1, 2, 3, 4, 5] (Sorted Array)
 * Process:
 * No elements are out of order → 0 inversions
 * Output: 0
 * <p>
 * 3️⃣ Example 3
 * <p>
 * Input: [40, 30, 20, 10] (Reverse Sorted)
 * Process:
 * Maximum possible inversions:
 * (40,30), (40,20), (40,10) - 3
 * (30,20), (30,10) - 2
 * (20,10) - 1
 * Total inversions = 6
 * Output: 6
 * 🔹 Constraints
 * 0 ≤ n ≤ 10³ (Array size limit)
 * -10³ ≤ arr[i] ≤ 10³ (Element range)
 */
public class NumberOfInversions {
    public static void main(String[] args) {
        int[] input = {2, 4, 1, 3, 5}; // 3 inversions
        int[] sorted = {1, 2, 3, 4, 5}; // 0 inversions
        int[] reverseSorted = {5, 4, 3, 2, 1}; // 10 inversions
        System.out.println(countInversions(input));
        System.out.println(countInversions(sorted));
        System.out.println(countInversions(reverseSorted));

    }

    public static int countInversions(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return count;
    }


    public static int countInversionsV2(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }
        return mergeSortAndCount(arr, 0, arr.length - 1);
    }

    private static int mergeSortAndCount(int[] arr, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int mid = left + (right - left) / 2;

        // Count inversions in left and right halves
        int count = mergeSortAndCount(arr, left, mid);
        count += mergeSortAndCount(arr, mid + 1, right);

        // Count split inversions and merge
        count += mergeAndCount(arr, left, mid, right);
        return count;
    }

    private static int mergeAndCount(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0, count = 0;

        // Merge two sorted subarrays and count inversions
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1); // All remaining elements in left subarray are greater
            }
        }

        // Copy remaining elements from both halves
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy the merged array back into the original array
        System.arraycopy(temp, 0, arr, left, temp.length);
        return count;
    }
}


