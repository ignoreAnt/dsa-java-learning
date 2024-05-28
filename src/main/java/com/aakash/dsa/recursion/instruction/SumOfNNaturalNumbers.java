package com.aakash.dsa.recursion.instruction;

public class SumOfNNaturalNumbers {

    public static void main(String[] args) {
        System.out.println(sumN(5));
        System.out.println(sumN(4));
        System.out.println(sumNV1(3));
        System.out.println(sumNV2(3, 0));
    }

    public static int sumN(int n){
        if (n == 0){
            return 0;
        }

        return n + sumN(n - 1);
        // TC : O(n) ; (n + 1) function calls
        // AS : O(n) ; (n + 1) functions in call stack
    }

    public static int sumNV1(int a){
        if(a < 0) {
            throw new IllegalArgumentException("Invalid Number");
        }

        if (a == 0){
            return 0;
        }

        return a + sumNV1(a - 1);
    }

    public static int sumNV2(int a, int sum){
        if (a == 0){
            return 0;
        }

        sum = a + sumNV2(a - 1, sum);
        return sum;
    }


}
