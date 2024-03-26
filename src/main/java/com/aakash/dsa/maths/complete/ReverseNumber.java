package com.aakash.dsa.maths.complete;

/**
 * Problem 2 : Reverse Number
 *
 * Problem Statement :  Given a number, return the reverse of the number
 *
 * Example :
 * i/p : 356 ⇒ o/p: 653
 * i/p: 2986 ⇒ o/p: 6892
 *
 * Solution :
 * Extract Individual Digits
 * Construct the new Number from extracted Digits
 */
public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverseNumber(356));
        System.out.println(reverseNumber(2986));
    }

    public static int reverseNumber(int n){
        int reverse = 0;
        while (n != 0){
            reverse = (reverse * 10) + (n % 10);
            n = n / 10;
        }

        return reverse;
    }
}
