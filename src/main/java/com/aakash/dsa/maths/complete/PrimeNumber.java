package com.aakash.dsa.maths.complete;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(29));
        System.out.println(isPrimeV2(29));
        System.out.println(isPrimeV3(997));
        for (int i = 0; i < 1000; i++) {
            System.out.println(i + "--> " + i/2 + " --> " + Math.sqrt(i));
        }
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }

        return true;
        // TC : O(n)
        // AS : O(1)

        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20..29
    }

    /**
     * Efficient solution :
     * Idea : Divisors always appear in pairs
     * 30 : (30,1) ; (2, 15); (3, 10) ; (5, 6)
     * 65 : (1, 65) ; (5, 13)
     * 25 : (1, 25) ; (5, 5)
     *
     * if (x, y) is a Pair
     * ==> x * y = n
     * and if x <= y
     * ==> x * x <= n
     * ==> x <= sqrt(n)
     */

    public static boolean isPrimeV2(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0){
                return false;
            }
        }

        return true;
        // TC : O(sqrt(n))
        // AS : O(1)
    }

    /**
     * More efficient solution :
     * for large numbers
     * Idea : by checking for n % 2 == 0 and for checking n % 3 == 0 we save many iterations
     */

    public static boolean isPrimeV3(int n){
        if (n == 1){
            return false;
        }
        if (n == 2 || n == 3){
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0){
            return false;
        }
        int k = 0;
        for (int i = 5; i * i < n; i = i + 6) {
            System.out.println(++k);
            if (n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }

        return true;
        // TC : O(sqrt(n))
        // AS : O(1)
    }
}
