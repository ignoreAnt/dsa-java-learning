package com.aakash.dsa.arrays.instruction;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 1, 1, 1, 1, 1};  // 6
        int[] numbers1 = {1, 1, 1, 1, 1, 1, 1}; // 5

        System.out.println(secondMax(numbers));
           /*
            Find Maximum :
                Test cases :
                1) array is null.
                2) array has zero length.
                3) check for negative numbers.
                4) check for single element array.
                5) check for all the elements in the array are same.
                6) check for duplicate elements.


                Extreme Case: check for integer limits.
         */
    }

    /*
      Finding second maximum :
      a0, a1, .....a(k-1), a(k)... a(n)
      max is maximum element encountered from a0 to a(k - 1),
      secondMax is second maximum element encountered from a0 to a(k - 1),
      Then we can have possible cases for a(k) :
        1) a(k) > max
           decision :
            secondMax = max
            max = a(k)
        2) a(K) = max
           decision :
             ignore
        3) a(k) < max
             decision :
              a(k) < max && a(k) > secondMax:
              decision :
                 secondMax = a(k)
  */
    public static int secondMax(int[] arr){
        if (arr == null || arr.length < 2){
            throw new IllegalArgumentException("null or incorrect length array was passed");
        }

        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]){
                secondMax = max;
                max = arr[i];
            }else if (secondMax < arr[i] && arr[i] < max){
                secondMax = arr[i];
            }
        }

        return secondMax;

        // TC : O(n)
        // SC : O(1)

        // TODO :
        /*
            1. Modify the solution for the edge case where all the elements of the array are same.
            2. Write the solution for finding second minimum value in an array.
         */
    }
}
