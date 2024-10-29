package com.aakash.dsa.search.instrcution;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(10));
        System.out.println(squareRoot(16));
        System.out.println(squareRoot(25));
        System.out.println(squareRoot(36));
        System.out.println(squareRoot(49));
        System.out.println(squareRoot(50));

        System.out.println(squareRootV2(10));
        System.out.println(squareRootV2(16));
        System.out.println(squareRootV2(25));
        System.out.println(squareRootV2(36));
    }

    private static int squareRoot(int number) {
        int i = 1;
        while (i * i <= number){
            i++;
        }
        return i - 1;
    }

    private static int squareRootV2(int number) {
        int start = 1;
        int end = number;
        int ans = 0;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (mid * mid == number){
                return mid;
            } else if (mid * mid < number){
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

}
