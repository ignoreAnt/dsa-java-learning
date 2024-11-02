package com.aakash.dsa.search.instrcution;

public class SearchInfiniteSortedArray {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(search(nums, target));
        System.out.println(searchV2(nums, target));
    }

    public static int search(int[] nums, int target){
        int i = 0;

        while(true)
        {
            if(nums[i] == target) return i;

            if(nums[i] > target) return -1;

            i++;
        }
        // TC : O(n)
        // AS : O(1)
    }

    public static int searchV2(int[] nums, int target){
        int start = 0;
        int end = 1;

        while(nums[end] < target){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return BinarySearch.binarySearchRecursive(nums, target, start, end);
        // TC : O(log*n)
        // AS : O(1)
    }
}
