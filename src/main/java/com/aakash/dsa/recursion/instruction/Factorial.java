package com.aakash.dsa.recursion.instruction;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(factTailRecursive(5, 1));
    }

    // fact:
    // if n = 0; n = 1 ; f(n) = 1
    // else f(n) = n * f(n-1)
    public static int fact(int n){
        if (n == 0 || n == 1){
            return 1;
        }

        return n * fact(n - 1);
        /*
          5 * fact(4)
                |
                4 * fact(3)
                       |
                       3 * fact(2)
                             |
                             2 * fact(1)
         */
    }

    public static int factTailRecursive(int n, int k){
        if (n == 0 || n == 1){
            return k;
        }

        return factTailRecursive(n - 1, k * n);
    }
}
