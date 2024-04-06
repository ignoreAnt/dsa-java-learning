package com.aakash.dsa.maths.complete;

public class PrimeNumber {
    public static void main(String[] args) {

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

    public static boolean isPrimev2(int n){
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

    public static boolean isPrimev3(int n){
        if (n == 1){
            return false;
        }
        if (n == 2 || n == 3){
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0){
            return false;
        }
        for (int i = 5; i * i < n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0){
                return false;
            }
        }

        return true;
        // TC : O(sqrt(n))
        // AS : O(1)
    }
}
