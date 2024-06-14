package com.aakash.dsa.recursion.instruction;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 7, 8, 10};
        int target1 = 11;
        System.out.println(findSubsetWithSum(nums1, target1)); // [3, 8]

        int[] nums2 = {1, 2, 3};
        int target2 = 5;
        System.out.println(findSubsetWithSum(nums2, target2)); // [2, 3]

        int[] nums3 = {1, 2, 3};
        int target3 = 7;
        System.out.println(findSubsetWithSum(nums3, target3)); // []
    }

    public static List<Integer> findSubsetWithSum(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        if (findSubsetWithSumHelper(nums, target, 0, result)) {
            return result;
        }
        return new ArrayList<>();
    }

    private static boolean findSubsetWithSumHelper(int[] nums, int target, int index, List<Integer> result) {
        if (target == 0) {
            return true;
        }
        if (index == nums.length) {
            return false;
        }
        // Include the current element
        result.add(nums[index]);
        if (findSubsetWithSumHelper(nums, target - nums[index], index + 1, result)) {
            return true;
        }
        // Exclude the current element
        result.remove(result.size() - 1);
        return findSubsetWithSumHelper(nums, target, index + 1, result);
    }

    static int countSubsets(int arr[], int n, int sum)
    {
        if(n==0)
            return sum==0? 1 : 0;

        return countSubsets(arr, n-1, sum) + countSubsets(arr, n-1, sum - arr[n-1]);
    }

}

