package com.aakash.dsa.maths.instructions;

public class ExampleTwo {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2002));
        System.out.println(isPalindrome(2312));
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
