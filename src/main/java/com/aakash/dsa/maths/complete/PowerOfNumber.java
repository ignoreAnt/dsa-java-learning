package com.aakash.dsa.maths.complete;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(power(2, 4));
        System.out.println(powerV2(2, 5));
    }

    public static int power(int x, int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        return result;
        // TC : O(n)
        // AS : O(1)
    }

    /**
     * The problem can be recursively defined by:
     *
     * power(x, n) = power(x, n / 2) * power(x, n / 2);        // if n is even
     *  2^4 = 2 * 2 * 2 * 2  = 2^2 * 2^2 ==> a^b * a^c = a^(b + c)
     * power(x, n) = x * power(x, n / 2) * power(x, n / 2);    // if n is odd
     *  2 ^ 5 = (2 * 2) * (2 * 2) * 2 == 2^2 * 2^2 * 2
     * Time Complexity: O(log(n))
     * Auxiliary Space: O(log(n)) // Since uses recursion and height of tree goes upto log(n) height
     */

    public static int powerV2(int x, int n){
        if(n == 0) {
            return 1;
        }

        int temp = powerV2(x, n/2);

        temp = temp * temp;

        if(n % 2 == 0)
            return temp;
        else
            return temp * x;

        //
    }
}
