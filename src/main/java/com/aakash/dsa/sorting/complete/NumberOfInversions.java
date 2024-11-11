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
                if (arr[i] > arr[j]){
                    count++;
                }
            }
        }

        return count;
    }
}
