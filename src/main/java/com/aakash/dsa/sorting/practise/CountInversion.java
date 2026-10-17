package com.aakash.dsa.sorting.practise;

public class CountInversion {
    // Given an array, find total number of pair such that i>j
    public static void main(String[] args) {
        //int[] arr = {1, 4, 5, 6, 3};
        int[] arr = {40, 30, 20, 10};
        //iterate over the collection and find pair such that i>j
         int countInversionPair = findTotalInversionInArrayV0(arr);
        //int countInversionPair = findTotalInversionInArrayV1(arr);
        System.out.println("Total no of inversion pair " + countInversionPair);
    }

    private static int findTotalInversionInArrayV0(int[] arr) {
        //iterate over the collection and find pair such that i>j
        // if found increment the count
        int count = 0, totalPair = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //System.out.print("( "+ i +", "+j +" ) ");
                if (arr[i] > arr[j]) {
                    count++;
                    System.out.print("( " + arr[i] + ", " + arr[j] + " ) ");
                }
                totalPair++;
            }
            System.out.println();
        }
        System.out.println("total Pair:: " + totalPair);
        return count;
    }

    private static int findTotalInversionInArrayV1(int[] arr) {
        // T(n) = O(n2);
        //iterate over the collection and find pair such that i>j
        // if found increment the count
        int count = 0, totalPair = 0;
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("total Pair:: " + totalPair);
        return count;
    }

    private static int mergeSort(int[] arr, int left, int right) {
        int mid = 0;
        int count=0;
        if (left < right) {

            mid = left + (right - left) / 2;
            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);

        }
        return count;

    }

    private static int merge(int[] arr, int left, int mid, int right) {
        int leftArrLen = mid - left + 1;
        int rightArrayLen = right - mid;
        int[] leftArray = new int[leftArrLen];
        int[] rightArray = new int[rightArrayLen];
        System.arraycopy(arr, left + 0, leftArray, 0, leftArrLen);
        for (int i = 0; i < rightArrayLen; i++) {
            rightArray[i] = arr[mid + i + 1];
        }
        int i = 0, j = 0, k = left;
        int count = 0;
        while (i < leftArrLen && j < rightArrayLen) {
            if (leftArray[i] > rightArray[j]) {
                System.out.print("( " + leftArray[i] + ", " + rightArray[j] + " ) ");
                count++;
            }
            i++;j++;

        }
        return  count;
    }
}
