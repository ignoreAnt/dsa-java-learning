package com.aakash.dsa.sorting.practise.set;

import java.util.Arrays;

public class SetDifference {
    public static void main(String[] args) {
       // int[] arr1= new int[]{1,2,3,3,4,5,6};
       // int[] arr1= new int[0];
        int[] arr1= null;
        int[] arr2= new int[]{1,2,3,3,4};
      //  System.out.println("A Minus B is "+ Arrays.toString(findDifferencev1(arr1,arr2)));
        System.out.println("A Minus B is "+ Arrays.toString(findDifferenceV2(arr1,arr2)));
    }
    private static int[] findDifferencev1(int[] arr1, int[] arr2){
        int len =  findLengthOfArray(arr1, arr2);

        if(len == 0){
            if(arr1.length == 0){
                return new int[0]; //empty array
            }
            else if (arr2.length ==0){
                return arr1;
            }
        }
        int[] intersectionResult = new int[len];
        //get the element from arr1 excluding common element
        //1. find the intersection of array.
        //2. remove the intersection from first array.
        setIntersectionV1(arr1,arr2, intersectionResult);
        return arrayDifference(arr1, intersectionResult);
    }
    private static int[] findDifferenceV2(int[] arr1, int[] arr2){
        int len =  findLengthOfArray(arr1, arr2);
        if(arr1.length == 0){
            return new int[0]; //empty array, as A-B = 0
        }
        else if (arr2.length ==0){
            return arr1; // if B is empty, then A-B = A
        }
        return arrayDifferenceV2(arr1, arr2, len);
    }

    private static int[] arrayDifferenceV2(int[] arr1, int[] arr2, int len) {
       int[] result = new int[len+1];
// to find the difference, add the element in the array, if they are not equal
        int i = 0, j=0,k=0;
        for (; i < arr1.length && j<arr2.length; i++,j++) {
            if (arr1[i] != arr2[j]) {
                result[k++] = arr1[i];
            }
        }
        // if the size of array1 is greater than array2
        // copy rest element to the result
        while(i<arr1.length){
            result[k++] = arr1[i++];
        }
        return  result;
    }

    private static void setIntersectionV1(int[] arr1, int[] arr2, int[] result) {
        for (int i = 0, j = 0,k = 0; i < arr1.length && j<arr2.length; ) {
            if (arr1[i] == arr2[j]) {
                result[k++] = arr1[i++];
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            }else{
                j++;
            }
        }
    }

    private static int[] arrayDifference(int[] arr1, int[] intersectionResult) {
        int len = findLengthOfArray(arr1, intersectionResult);

        int[] result = new int[len+1];

        for (int i = 0, j=0,k=0; i < arr1.length; i++,j++) {
            if (arr1[i] != intersectionResult[j]) {
                result[k++] = arr1[i];
            }
        }
        return  result;
    }

    private static int findLengthOfArray(int[] arr1, int[] arr2) {
        int len ;
        if(arr1 ==null || arr2 == null){
            throw new IllegalArgumentException("Invalid Array");
        }
        else
        {
            if (arr1.length > arr2.length) {
                len = arr1.length;
            } else if (arr1.length < arr2.length) {
                len = arr2.length;
            } else {
                len = arr1.length;
            }
        }
        return len;
    }
}
