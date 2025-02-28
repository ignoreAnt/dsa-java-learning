package com.aakash.dsa.dp.practice;

import static org.junit.jupiter.api.Assertions.*;

import com.aakash.dsa.dp.practice.LongestCommonSubSequence;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonSubSequenceTest {

    @ParameterizedTest(name = "Naive LCS of \"{0}\" and \"{1}\" should be {2}")
    @CsvSource({
        "AXYZ, BAZ, 2",
        "ABC, ABC, 3",
        "ABC, DEF, 0",
        "AGGTAB, GXTXAYB, 4"
    })
    @DisplayName("Test LCS Naive Method")
    void testLcsNaive(String s1, String s2, int expected) {
        assertEquals(expected, LongestCommonSubSequence.lcsNaive(s1, s2, s1.length(), s2.length()));
    }

    @ParameterizedTest(name = "LCS with Substring of \"{0}\" and \"{1}\" should be {2}")
    @CsvSource({
        "AXYZ, BAZ, 2",
        "ABC, ABC, 3",
        "ABC, DEF, 0",
        "AGGTAB, GXTXAYB, 4"
    })
    @DisplayName("Test LCS with Substring Method")
    void testLcsWithSubString(String s1, String s2, int expected) {
        assertEquals(expected, LongestCommonSubSequence.lcsWithSubString(s1, s2));
    }

    @ParameterizedTest(name = "Memoized LCS of \"{0}\" and \"{1}\" should be {2}")
    @CsvSource({
        "AXYZ, BAZ, 2",
        "ABC, ABC, 3",
        "ABC, DEF, 0",
        "AGGTAB, GXTXAYB, 4"
    })
    @DisplayName("Test LCS Memoization Method")
    void testLcsMemo(String s1, String s2, int expected) {
        assertEquals(expected, LongestCommonSubSequence.lcsMemo(s1, s2));
    }

    @ParameterizedTest(name = "Tabulation LCS of \"{0}\" and \"{1}\" should be {2}")
    @CsvSource({
        "AXYZ, BAZ, 2",
        "ABC, ABC, 3",
        "ABC, DEF, 0",
        "AGGTAB, GXTXAYB, 4"
    })
    @DisplayName("Test LCS Tabulation Method")
    void testLcsTabulation(String s1, String s2, int expected) {
        assertEquals(expected, LongestCommonSubSequence.lcsTabulation(s1, s2));
    }
}