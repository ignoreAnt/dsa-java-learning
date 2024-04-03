package com.aakash.dsa.maths.complete;

public class NumberOfTrailingZerosInFactorial {
    public static void main(String[] args) {
        System.out.println(numberOfZeros(5));
        System.out.println(numberOfZerosV2(24));
    }

    public static int numberOfZeros(int n){
        int fact = factorial(n); // O(n)
        int count = 0;
        while (fact != 0){ //O(number of zeros)
            int lastDigit = fact % 10;
            if (lastDigit == 0){
                count++;
            }else {
                break;
            }
            fact = fact / 10;
        }

        return count;

        // TC : O(n) + O(number of zeros) ==> O(n)
        // AS : O(1)
    }

    public static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static int numberOfZerosV2(int num){
        if ( num < 0){
            return -1;
        }
        
        int count = 0;
        for (int i = 5; i <= num; i *= 5) {
            count += num/i;
        }

        return count;
        // TC : O(log(n)) :: O(1) < O(log(n)) < O(n) < O(n*log(n))
        // AS : O(1)
    }


}
