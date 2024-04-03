package com.aakash.dsa.maths.complete;

public class LCM {
    public static void main(String[] args) {

    }

    public static int lcm(int a, int b){
        int result = Math.max(a, b);
        while (true){
            if (result % a == 0 && result % b == 0){
                return result;
            }
            result++;
        }
    }
}
