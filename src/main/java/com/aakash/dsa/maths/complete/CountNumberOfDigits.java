package com.aakash.dsa.maths.complete;


/**
 * Problem Statement : Given a number, return the count of digits in this number.
 *
 * Example :
 * i/p : 1567 ⇒ o/p : 4 ; Since we have four digits in the number we return 4.
 * i/p : 256 ⇒ o/p : 3;
 * i/p : 58964 ⇒ o/p : 5;
 *
 * Solution :
 *
 * Two approaches :
 * 1. Iterative
 * 2. Recursive
 */
public class CountNumberOfDigits {

    public static void main(String[] args) {
        System.out.println(countDigits(1567));
        System.out.println(countDigits(256));
        System.out.println(countDigits(58964));

        System.out.println(recurCountDigits(1567));
        System.out.println(recurCountDigits(256));
        System.out.println(recurCountDigits(58964));
    }

    public static int countDigits(int n){
        int count = 0;
        if (n == 0){
            return 1;
        }
        while (n != 0){
            n = n/10;
            count++;
        }

        return count;
        // Time complexity ==> O(log[10]n)
        // Auxiliary Space ==> O(1)
    }

    public static int recurCountDigits(int n){
        if (n/10 == 0){
            return 1;
        }
         return 1 + recurCountDigits(n/10);
        // Time Complexity ==> O(log[10]n)
        // Auxiliary Space ==> O(log[10]n)
    }
}
