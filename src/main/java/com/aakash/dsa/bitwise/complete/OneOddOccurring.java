package com.aakash.dsa.bitwise.complete;

import java.util.HashMap;
import java.util.Map;

public class OneOddOccurring {

    // (x ^ y) = (y ^ x)
    // x^ (y ^ z) = (x ^ y) ^ z
    // (x ^ 0) = x
    // (x ^ x) = 0
    public static void main(String[] args) {
        int[] ints = new int[]{1, 1, 2, 2, 2, 2, 3}; // 3
        int[] ints2 = new int[]{1, 2, 2, 2, 2, 3, 1}; // 3
        int[] ints1 = new int[]{1, 1, 2, 2, 2, 2, 3, 3, 3};//3
        System.out.println(findOddV2(ints));
        System.out.println(findOddV2(ints1));
        System.out.println(findOddV2(ints2));

//        System.out.println(frequency(ints));
//        System.out.println(findOddV3(frequency(ints)));
        // 2 = 010
        // 0 = 000
        // -------
        // 2 = 010

        // 3 = 011
        // 3 = 011
        // -------
        // 0 = 000
//        System.out.println(2 ^ 2 ^ 2 ^ 2 ^ 2);


    }

    public static Map<Integer, Integer> frequency(int[] ints){
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int anInt : ints) {
            frequencyMap.put(anInt, frequencyMap.getOrDefault(anInt, 0) + 1);
        }
        return frequencyMap;
    }

    public static int findOddV3(Map<Integer, Integer> frequencyMap){
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return -1;
        // TC : O(n)
        // AS : O(n)
    }

    static int findOdd(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int count = 0;

            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            if(count % 2 != 0) {
                return arr[i];
            }

        }

        return 0;
        // TC : O(n^2)
        // AS : O(1)
    }

    static int findOddV2(int[] arr) {
        int res = 0;

        for(int i = 0; i < arr.length; i++) {
            res = res ^ arr[i];
        }

        return res;
        // TC : O(n)
        // AS : O(1)
    }
}
