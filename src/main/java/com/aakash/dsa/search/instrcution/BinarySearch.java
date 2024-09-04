package com.aakash.dsa.search.instrcution;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(nums, 3));
        System.out.println(binarySearchRecursive(nums, 5, 0, nums.length - 1));

    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return mid;
            }else if (arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target){
            return mid;
        }else if (arr[mid] < target){
            return binarySearchRecursive(arr, target, mid + 1, end);
        }else{
            return binarySearchRecursive(arr, target, start, mid - 1);
        }
    }
}
