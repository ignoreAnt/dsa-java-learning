package com.aakash.dsa.maths.complete;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1001));
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
}
