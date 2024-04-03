package com.aakash.dsa.maths.complete;

public class FactorialOfNumber {

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }

        return fact;
        // TC : O(n)
        // AS : O(1)
    }
}
