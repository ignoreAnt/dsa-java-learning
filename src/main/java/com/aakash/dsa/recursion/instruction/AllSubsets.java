package com.aakash.dsa.recursion.instruction;

import java.util.ArrayList;
import java.util.List;

/**
 * ### Generate All Subsets
 *
 * **Problem Description:**
 *
 * Given an array of distinct integers, return all possible subsets (the power set).
 * The solution set must not contain duplicate subsets. Return the solution in any order.
 *
 * **Constraints:**
 * - The length of the array is between 1 and 10.
 * - The elements of the array are all distinct.
 *
 * **Example 1:**
 * ```
 * Input: nums = [1,2,3]
 * Output: [[],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3]]
 * ```
 *
 * **Example 2:**
 * ```
 * Input: nums = [0]
 * Output: [[],[0]]
 * ```
 *
 * **Function Signature:**
 * ```
 * public List<List<Integer>> subsets(int[] nums);
 * ```
 */
public class AllSubsets {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {0};

        System.out.println(subsets(nums1)); // Output: [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
        System.out.println(subsets(nums2)); // Output: [[], [0]]
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        // Base case: if we've processed all elements
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Case 1: Exclude the current element and proceed to the next element
        generateSubsets(index + 1, nums, current, result);

        // Case 2: Include the current element and proceed to the next element
        current.add(nums[index]);
        generateSubsets(index + 1, nums, current, result);

        // Backtrack: remove the last added element before returning to the previous step
        current.remove(current.size() - 1);
    }
}
