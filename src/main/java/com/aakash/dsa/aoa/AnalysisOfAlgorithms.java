package com.aakash.dsa.aoa;

public class AnalysisOfAlgorithms {
    public static void main(String[] args) {

        System.out.println(getSum(10));
        System.out.println(getSumV2(10));
        System.out.println(getSumV3(10));

    }

    public static int getSum(int n){ // --> linear n --> number of operations will be directly proportional
        int sum = 0; // constant
        for (int i = 1; i <= n ; i++) { // i<= n --> n times , i++ --> n times
            sum = sum + i; // n times
        //            sum += i;
        }
        // i <= n --> n times
        // i++ --> n times
        // sum = sum + i --> n times
        // n + n + n - 2 = 3n - 2 computations steps

        return sum;
    }

    public static int getSumV2(int n){ // n2 --> Quadratic running time
        int sum = 0;
        for (int i = 1; i <= n; i++) { // 1 + 2 (1 + 1) + 3 (1 + 1 + 1) =  n2/2 + n/2
            for (int j = 1; j <= i ; j++) {
//                sum = sum + 1
                sum++; // 1 + (1 + 1) + (1 + 1 + 1)
            }
        }

        return sum;
    }

    public static int getSumV3(int n){ // constant time
        return n * (n + 1)/2;
    }
}
