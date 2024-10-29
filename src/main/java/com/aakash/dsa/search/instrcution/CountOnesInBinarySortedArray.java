package com.aakash.dsa.search.instrcution;

public class CountOnesInBinarySortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 1, 1};
        System.out.println(countOnes(arr));
        System.out.println(countOnesV2(arr));
    }

    private static int countOnesV2(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] == 0){
                start = mid + 1;
            }else {
                if (mid == 0 || arr[mid - 1] != arr[mid]){
                    return arr.length - mid;
                }else {
                    end = mid - 1;
                }
            }
        }

        return 0;
    }

    private static int countOnes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count++;
            }
        }
        return count;
    }
}
