package com.aakash.dsa.aoa;

public class AnalysisOfAlgorithms {
    public static void main(String[] args) {
        System.out.println(getSum(10));
        System.out.println(getSumV2(10));
        System.out.println(getSumV3(10));
    }
    
    private static int getSum(int n){
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum = sum + i;
        }

        return sum;
    }

    private static int getSumV2(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                sum++; // 1 + (1 + 1) + (1 + 1 + 1)
            }
        }

        return sum;
    }

    private static int getSumV3(int n){
        return n * (n + 1)/2;
    }
}
