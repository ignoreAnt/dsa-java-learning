package com.aakash.dsa.maths.complete;

public class GCDorHCF {
    public static void main(String[] args) {
        System.out.println(gcd(4, 6));
        System.out.println(gcdV2(4, 6));
    }

    public static int gcd(int a, int b){

        int result = Math.min(a, b);

        while (result > 0){
            if (a % result == 0 && b % result == 0){
                break;
            }
            result--;
        }

        return result;
        // TC : O(min(a,b))
        // AS : O(1)
    }

    /**
     * Euclid Algorithm :
     * Basic Idea :
     *  Let b is smaller than a
     *  gcd(a, b) = gcd(a-b, b)
     *  Why ?
     *  Let g be the GCD of a and b
     *  a = g*x; b = g*y and GCD(x, y) = 1
     *  ==> (a - b) = g(x - y)
     */

    public static int gcdV2(int a, int b){

        while (a != b){
            if (a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }

        return a;
        // TC : O()
        // AS : O(1)
    }

    public static int gcdv3(int a, int b){
        if ( b == 0){
            return a;
        }

        return gcd(b, a % b);
    }
}
