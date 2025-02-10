package com.aakash.dsa.search.instrcution;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {5, 15, 25, 35, 45};

        System.out.println(findMedianSortedArray(a1, a2));
        System.out.println(findMedianSortedArrays(a1, a2));
    }

    private static double findMedianSortedArray(int[] a1, int[] a2) {
        int length = a1.length + a2.length;
        int[] temp = new int[length];

        // Merge the two arrays
        System.arraycopy(a1, 0, temp, 0, a1.length);
        System.arraycopy(a2, 0, temp, a1.length, a2.length);

        // Sort the merged array
        java.util.Arrays.sort(temp);

        // Find median
        if (length % 2 == 0) {
            return (double) (temp[length / 2 - 1] + temp[length / 2]) / 2;
        }else {
            return temp[length / 2];
        }

        // TC : O(n1 * n2 * log(n1 + n2))
        // AS : O(n1 + n2)
    }

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return findMedianSortedArrays(arr2, arr1); // Ensure arr1 is the smaller array
        }

        int n1 = arr1.length; // Length of the smaller array
        int n2 = arr2.length; // Length of the larger array
        int begin = 0, end = n1; // Begin and end indices of the smaller array

        // Binary search to find the correct partition
        while (begin <= end) {
            int i =  begin + (end - begin) / 2; // i is the partition index
            int j = (n1 + n2 + 1) / 2 - i; // j is the partition index of the larger array

            // Check if the partition indices are valid
            int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : arr1[i - 1];
            int minRight1 = (i == n1) ? Integer.MAX_VALUE : arr1[i];

            // Check if the partition indices are valid
            int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : arr2[j - 1];
            int minRight2 = (j == n2) ? Integer.MAX_VALUE : arr2[j];


            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // We have found the correct partition for even number of elements
                if ((n1 + n2) % 2 == 0) {
                    // Return the average of the two middle elements
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                } else {
                    // Return the middle element
                    return Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                end = i - 1; // Move search to the left
            } else {
                begin = i + 1; // Move search to the right
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted"); // Should not reach here if input is valid
    }
}


