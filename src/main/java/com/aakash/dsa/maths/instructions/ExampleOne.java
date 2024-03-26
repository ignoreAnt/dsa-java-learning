package com.aakash.dsa.maths.instructions;

public class ExampleOne {
    public static void main(String[] args) {

       int  num = 0;
        System.out.println(countDigits(num)); // extract the last digit of the number
        System.out.println(reverseDigit(123));
        System.out.println(reverseDigit(1));
        System.out.println(reverseDigit(0));
    }

    public static int absolute(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return num;
    }


    public static int countDigits(int n){

        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n != 0){
            n = n /10;
            count++;
        }
        return count;

        // Time Complexity :  O(number of digits) ==> O(log[10]n)
        // Auxiliary Space :  O(1)
    }


    public static int reverseDigit(int n){
        // when we divide a number by 10 we are reducing the number by 1 digit
        // When we apply modulo operator we extract the last digit
        // 123
        // 10^2 * 1 + 10^1 * 2 + 10^0 * 3
        // reverse 321
        // 10^2 * 3 + 10^1 * 2 + 10^0 * 1
        // loop : (10 * somevalue) + anothervalue
        // another value = num % 10
        // somevalue ??
        // x < y ==> x % y = x

        int reverse = 0;
        while (n != 0){
            reverse = (10 * reverse) + (n % 10);
            n = n/10;
        }

        return reverse;
    }


}
