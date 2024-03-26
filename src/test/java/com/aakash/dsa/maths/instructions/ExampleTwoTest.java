package com.aakash.dsa.maths.instructions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTwoTest {
    @ParameterizedTest(name = "{0} is palindrome : {1}")
    @CsvSource({
            "2002, true",
            "2312, false",
            "0, true",
            "8, true"
    })
    void testPalindrome(int input, boolean output){
        // Arrange
        // Act
        boolean actual = ExampleTwo.isPalindrome(input);

        // Assert
        assertEquals(output, actual);
    }

}