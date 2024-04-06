package com.aakash.dsa.maths.complete;

public class AllDivisorOfNumber {
    public static void main(String[] args) {
        allDivisors(6);
        allDivisorsV2(25);
    }

    public static void allDivisors(int num){
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }

    public static void allDivisorsV2(int num){
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0){
                System.out.println(i);
                if (i != num/i){
                    System.out.println(num/i);
                }
            }
            
        }
    }
}
