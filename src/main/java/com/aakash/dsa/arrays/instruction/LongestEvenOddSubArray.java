package com.aakash.dsa.arrays.instruction;

public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        int[] nums = {5, 10, 20, 6, 3, 8};
        System.out.println(maxEvenOddSubArrayLength(nums));
        System.out.println(maxEvenOddSubArrayLengthV2(nums));
    }

    public static int maxEvenOddSubArrayLength(int[] arr){
        int maxLength = 1;
        for (int i = 0; i < arr.length; i++) {
            int currentLength = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] % 2 == 0 && arr[j - 1] % 2 != 0)
                    || (arr[j] % 2 != 0 && arr[j - 1] % 2 == 0)){
                    currentLength++;

                }else {
                    break;
                }
            }
            maxLength = Math.max(currentLength, maxLength);
        }

        return maxLength;
    }
    
    public static int maxEvenOddSubArrayLengthV2(int[] arr){
        int maxLength = 1;
        int currentLength = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0)
                    || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)){
                currentLength++;
                maxLength = Math.max(currentLength, maxLength);
            }else{
                currentLength = 1;
            }
        }

        return maxLength;
    }
}
