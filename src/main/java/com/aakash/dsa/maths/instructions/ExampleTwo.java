package com.aakash.dsa.maths.instructions;

import java.math.BigInteger;

public class ExampleTwo {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2002));
        System.out.println(isPalindrome(2312));
        System.out.println(factorial(0));
        System.out.println(factorial(5));
        System.out.println(factorialV2(0));
        System.out.println(factorialV2(5));
        for (int i = 0; i < 31; i++) {
            System.out.println( i + "! ==> " + factorialV3(i));
        }

        System.out.println(numberOfTrailingZeros(4));
    }

    public static boolean isPalindrome(int num){

        int reverse = 0;
        int temp = num;

        while (temp != 0){
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }

        return (reverse == num);
    }


    public static int factorial(int n){
        if (n <= 1){
            return 1;
        }
        return n * factorial( n - 1);

        // n = 4
        // ==> 4 * factorial (4 - 1)
        // ==> 4 * factorial(3)
        // ==> 4 * 3 * factorial(2)
        // ==> 4 * 3 * 2 * factorial(1)
        // ==> 4 * 3 * 2 * 1
        // TC : O(n)
        // AS : O(n)
    }

    public static long factorialV2(int n){
        long fact = 1;
        for (long i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
        // TC : O(n)
        // AS : O(1)
    }

    public static BigInteger factorialV3(int n){
        BigInteger bigInteger = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
           bigInteger =  bigInteger.multiply(BigInteger.valueOf(i));
        }

        return bigInteger;
    }

    public static int numberOfTrailingZeros(int n){
        long fact = factorialV2(n);  // O(n) ; O(1)

        int count = 0;
        while (fact != 0){
            if (fact % 10 == 0){
                count++;
                fact /= 10;
            }else {
                break;
            }
        }

        return count;

        // TC : O(n) + O(number of digits) ==> O(n)
        // AS : O(1) + O(1) ==> O(1)
    }



    // 6! = 6 * 5 * 4 * 3 * 2 * 1
    // ==> (3 * 2) * 5 * (2 * 2) * 3 * 2 * 1
    // n/5 + n/25 + n/125 + ....
}
