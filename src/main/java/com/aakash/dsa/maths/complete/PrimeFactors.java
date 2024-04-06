package com.aakash.dsa.maths.complete;

import static com.aakash.dsa.maths.complete.PrimeNumber.isPrimev3;

public class PrimeFactors {
    public static void main(String[] args) {
        primeFactors(12);
        primeFactorsV2(450);
        primeFactorsV2(84);
    }

    public static void primeFactors(int num){
        for (int i = 2; i < num; i++) { // O(n)
            if (isPrimev3(i)){
                int x = i;
                while (num % x == 0){   // O(log(n))
                    System.out.print(i + ", ");
                    x = x * i;
                }
            }
        }
        System.out.println();
        // TC : O(n * log(n))
        // AS : O(1)
    }

    /**
     * Idea
     * 1. Divisors always appear in pairs so loop needs to run from 2 to sqrt(n)
     * 2. A number can be written as the multiplications of the power of prime factors
     * ==> 12 = 2^2 * 3
     * ==> 450 = 2^1 * 3^2 * 5^2
     * ==> 13 = 13^1 (If the number is prime the number can )
     */

    public static void primeFactorsV2(int num){
        if (num < 1){
            return;
        }
        for (int i = 2; i * i < num; i++) {
            while (num % i == 0){
                System.out.print(i);
                num = num/i;
            }
        }
        // If the last prime number is prime number with power 1
        if (num > 1){
            System.out.println(num);
        }
        System.out.println();
    }
}
