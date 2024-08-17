package com.aakash.dsa.arrays.instruction;

public class PrintSubArrayOfAnArray {
    public static void main(String[] args) {
       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
       // [1], [2], [3], [1, 2], [1, 2, 3], [2, 3]
       // [1, 2, 3]
        //1 :  maxSoFar = 1; maxEndingHere = 1
        // 2 : maxEndingHere = 1 + 2 = 3; maxSoFar = 3;
        // 2 : maxEndingHere = 3 + 3 = 6; maxSoFar = 6;
       // []
        System.out.println(printSubArray(nums));
    }

    public static int printSubArray(int[] arr){
        int maxSum = 0;

        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;
            for (int end = start; end < arr.length; end++) {
//                for (int i = start; i <= end; i++) {
//                    System.out.print(arr[i] + ", ");
                currentSum += arr[end];
//                }

                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;

        // TC : O(n^3)
        // AS : O(1)
    }
}
