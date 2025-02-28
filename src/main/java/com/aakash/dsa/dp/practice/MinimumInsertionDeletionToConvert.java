package com.aakash.dsa.dp.practice;

public class MinimumInsertionDeletionToConvert {
    public static void main(String[] args) {
        String s1 = "geek";
        String s2 = "gfeek";

        String s3 = "heap";
        String s4 = "pea";

        System.out.println(minInsertionDeletion(s1, s2));
        System.out.println(minInsertionDeletion(s3, s4));

        System.out.println(minInsertDelTabulation(s1, s2));
        System.out.println(minInsertDelTabulation(s3, s4));
    }

    private static int minInsertionDeletion(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();

        int[][] memo = new int[s1Length + 1][ s2Length + 1];
        for (int i = 0; i <= s1Length; i++) {
            for (int j = 0; j <= s2Length; j++) {
                memo[i][j] = -1;
            }
        }
        int lcs = minInsertDelMemo(s1, s2, s1Length, s2Length, memo);
        int deletions = s1Length - lcs;
        int insertions = s2Length - lcs;

        return insertions + deletions;
    }

    private static int minInsertDelMemo(String s1, String s2, int s1Length, int s2Length, int[][] memo){

        if (s1Length == 0 || s2Length == 0){
            return 0;
        }

        if (memo[s1Length][s2Length] != -1){
            return memo[s1Length][s2Length];
        }

        if (s1.charAt(s1Length - 1) == s2.charAt(s2Length - 1)){
            memo[s1Length][s2Length] = 1 + minInsertDelMemo(s1, s2, s1Length - 1, s2Length - 1, memo);
        }else {
            memo[s1Length][s2Length] = Math.max(
                    minInsertDelMemo(s1, s2, s1Length, s2Length - 1, memo),
                    minInsertDelMemo(s1, s2, s1Length - 1, s2Length, memo)
            );
        }

        return memo[s1Length][s2Length];
    }

    private static int minInsertDelTabulation(String s1, String s2){
        int s1Length = s1.length();
        int s2Length = s2.length();

        int[][] dp = new int[s1Length + 1][s2Length + 1];

        for (int i = 1; i <= s1Length; i++) {
            for (int j = 1; j <= s2Length; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.max(dp[i][j -1], dp[i - 1][j]);
                }
            }
        }

        int lcs = dp[s1Length][s2Length];
        int deletion = s1Length - lcs;
        int insertion = s2Length - lcs;

        return insertion + deletion;
    }
}
