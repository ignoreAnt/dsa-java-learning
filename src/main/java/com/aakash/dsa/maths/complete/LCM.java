package com.aakash.dsa.maths.complete;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(12, 15));
    }

    public static int lcm(int a, int b){
        int result = Math.max(a, b);
        while (true){
            if (result % a == 0 && result % b == 0){
                return result;
            }
            result++;
        }
        // TC :
        // AS : O(1)
    }


    /**
     *  a * b = gcd(a,b) * lcm(a,b)
     */

    public static int gcd(int a, int b){
        if (b == 0){
            return a;
        }

        return gcd(b, a % b);
        // TC : log(min(a,b))
        // AS : O(1)
    }

    public static int lcmv2(int a, int b){
        return (a * b)/gcd(a, b);
        // TC : log(min(a,b))
        // AS : O(1)
    }
}
