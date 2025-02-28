package com.aakash.dsa.strings.practice;

import java.util.ArrayList;
import java.util.List;

public class CheckSubsequence {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "ADC";
//        System.out.println(checkSubsequence(s1, s2));
        // 000 << 1 ==> 001 ==> 1
        // 001 << 1 ==> 010 ==> 0 * 2^2 + 1 * 2^1 + 0 * 2^0 = 2
        // 010 << 1 ==> 100 ==> 1 * 2^2 + 0 * 2^1 + 0 * 2^0 = 4
//        System.out.println(1 << s1.length());
        // 010 = 2
        // 001 = 1
        // 010 & 001 ==>  000 => 2 & 1 ==> 0
        // 100 & 001 ==> 000 ==> 4 & 1 ==> 0

        // 110101
        // 000001 & 110101 ==> 000001
        // 000010 & 110101 ==> 000000
        // 000100 & 110101 ==> 000100
        //
//        int num = 0b10101010;
//        int count = 0;
//        for (int i = 0b0; i < (1 << 3); i++) {
//            if (num & (1 << i) != 0){
//                count++;
//            }
//        }
//        System.out.println((1 << 1) & 1);
        System.out.println(checkSubsequenceV2(s1, s2));
    }

    private static boolean checkSubsequence(String str, String subSeq) {
        List<String> subSequences = new ArrayList<>();
//        generateSubSequences(str, 0, "", subSequences);
        generateSubsequencesV2(str, subSequences);
        for (String subSequence : subSequences) {
            if (subSequence.equals(subSeq)) {
                return true;
            }
        }
        return false;
    }

    private static void generateSubSequences(String str, int index, String cur, List<String> subsequences){

        // Base case: when we've processed all character
        if (index == str.length()){
            subsequences.add(cur);
            return;
        }

        // include
        generateSubSequences(str, index + 1, cur + str.charAt(index), subsequences);

        // exclude
        generateSubSequences(str, index + 1, cur, subsequences);
    }

    private static List<String> generateSubsequencesV2(String str, List<String> subsequences) {

        int n = str.length();

        // Use bitmasking to generate all subsequences

        for (int i = 0; i < (1 << n); i++) { // 1 << n is equivalent to 2^n

            StringBuilder subsequence = new StringBuilder();

            for (int j = 0; j < n; j++) {

                // Check if the j-th bit is set in the current mask

                if ((i & (1 << j)) != 0) {

                    subsequence.append(str.charAt(j));

                }

            }

            subsequences.add(subsequence.toString());

        }

        return subsequences;

    }

    private static boolean checkSubsequenceV2(String str, String subSeq) {
        if (str == null || str.isEmpty() || str.length() < subSeq.length()){
            return false;
        }

        if (subSeq.isEmpty()){
            return true;
        }

        int first = 0; // index for str
        int second = 0; // index for subseq

        while (first < str.length() && second < subSeq.length()){

            if (str.charAt(first) == subSeq.charAt(second)){

                first++;
                second++;

            }else{

                first++;

            }
        }

        if (second == subSeq.length()){
            return true;
        }else{
            return false;
        }
    }


}
