package com.aakash.dsa.dp.practice;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String s1 = "AXYZ";
        String s2 = "BAZ";
        System.out.println(lcsNaive(s1, s2, s1.length(), s2.length()));
        System.out.println(lcsWithSubString(s1, s2));
        System.out.println(lcsMemo(s1, s2));
        System.out.println(lcsTabulation(s1, s2));
    }

    static int lcsNaive(String s1, String s2, int s1Length, int s2Length) {

        // Base case if either string is empty LCS is 0
        if (s1Length == 0 || s2Length == 0){
            return 0;
        }

        // If the last character match of s1 and s2 we have found one character of lcs
        // now we need to find the lcs by decreasing the length of both s1 and s2
        if (s1.charAt(s1Length - 1) == s2.charAt(s2Length - 1)){
            return 1 + lcsNaive(s1, s2, s1Length - 1, s2Length -1);
        }

        // Last characters did not match so we find lcs by taking maximum of:
        // 1. lcs of s1, s2 by decreasing one character of s1 and keeping s2 as it is.
        // 2. lcs of s1, s2 by decreasing on character of s2 and keeping s1 as it is.
        return Math.max(lcsNaive(s1,s2, s1Length - 1, s2Length), lcsNaive(s1, s2, s1Length, s2Length - 1));

        // TC : O(2^(n + m))
        // SC : O(n + m) --> for function call stack
    }

    static int lcsWithSubString(String s1, String s2){
        int s1Length = s1.length();
        int s2Length = s2.length();

        if (s1Length == 0 || s2Length == 0){
            return 0;
        }

        if (s1.charAt(s1Length - 1) == s2.charAt(s2Length - 1)){
            return 1 + lcsWithSubString(s1.substring(0, s1Length - 1), s2.substring(0,s2Length - 1));
        }

        return Math.max(lcsWithSubString(s1.substring(0,s1Length - 1), s2), lcsWithSubString(s1, s2.substring(0, s2Length - 1)));

        // TC : O((n + m)(2^m * 2^n))
        // SC : O(n+m) * O(n+m) // for stack size * for substring creation
    }

    static int lcsMemo(String s1, String s2){
        int s1Length = s1.length();
        int s2Length = s2.length();
        int[][] memo = new int[s1Length + 1][s2Length + 1];

        for (int i = 0; i <= s1Length; i++) {
            for (int j = 0; j <= s2Length; j++) {
                memo[i][j] = -1;
            }
        }

        return lcsMemoRecur(s1, s2, s1Length, s2Length, memo);
    }

    private static int lcsMemoRecur(String s1, String s2, int s1Length, int s2Length, int[][] memo){

        if (s1Length == 0 || s2Length == 0){
            return 0;
        }

        // check in memo 2D array if there is value assigned, if yes return that value
        if (memo[s1Length][s2Length] != -1){
            return memo[s1Length][s2Length];
        }

        // There is no value assigned in memo array so compute and assign the value
        if (s1.charAt(s1Length - 1) == s2.charAt(s2Length - 1)){
            memo[s1Length][s2Length] = 1 + lcsMemoRecur(s1, s2, s1Length - 1, s2Length - 1, memo);
        }else {
            memo[s1Length][s2Length] = Math.max(
                    lcsMemoRecur(s1, s2, s1Length -1, s2Length, memo),
                    lcsMemoRecur(s1, s2, s1Length, s2Length - 1, memo)
                    );
        }

        return memo[s1Length][s2Length];

    }

    static int lcsTabulation(String s1, String s2){
        int s1Length = s1.length();
        int s2Length = s2.length();

        // Create Tabulation as a 2D array
        int[][] dp = new int[s1Length + 1][ s2Length + 1];

        // Fill the DP table in bottom up manner
        for (int i = 1; i <= s1Length; i++) {
            for (int j = 1; j <= s2Length; j++) {
                if (s1.charAt(i - 1) == s2.charAt( j - 1) ){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j -1]);
                }
            }
        }

        return dp[s1Length][s2Length];
    }
}
