package com.aakash.dsa.arrays.instruction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeftRotateArrayByOneTest {

    // Method source for the test cases with descriptions
    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("Empty array, remains empty", new int[]{}, new int[]{}),
                Arguments.of("Single element array with zero", new int[]{0}, new int[]{0}),
                Arguments.of("Single element array with non-zero", new int[]{1}, new int[]{1}),
                Arguments.of("All zeros", new int[]{0, 0, 0}, new int[]{0, 0, 0}),
                Arguments.of("Typical case", new int[]{1, 2, 3, 4, 5}, new int[]{2, 3, 4, 5, 1}),
                Arguments.of("Two elements", new int[]{1, 2}, new int[]{2, 1}),
                Arguments.of("Min and max values", new int[]{100, -100, 50, -50}, new int[]{-100, 50, -50, 100}),
                Arguments.of("Min, zero, max", new int[]{-100, 0, 100}, new int[]{0, 100, -100}),
                Arguments.of("Identical elements", new int[]{7, 7, 7, 7}, new int[]{7, 7, 7, 7}),
                Arguments.of("Alternating positive and negative", new int[]{-1, 1, -1, 1}, new int[]{1, -1, 1, -1}),
                Arguments.of("All zeros", new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}),
                Arguments.of("Zeros at start and end", new int[]{0, 1, 2, 3, 0}, new int[]{1, 2, 3, 0, 0}),
                Arguments.of("Zeros at end", new int[]{1, 2, 3, 0, 0}, new int[]{2, 3, 0, 0, 1}),
                Arguments.of("Zeros in middle", new int[]{1, 0, 3, 0, 12}, new int[]{0, 3, 0, 12, 1}),
                Arguments.of("Zeros at start and middle", new int[]{0, 0, 1, 0, 3}, new int[]{0, 1, 0, 3, 0}),
                Arguments.of("Single zero", new int[]{1, 0}, new int[]{0, 1}),
                Arguments.of("With large numbers", new int[]{100, 0, -5, 0, 20}, new int[]{0, -5, 0, 20, 100}),
                Arguments.of("With negative numbers", new int[]{-1, 0, 3, -4, 12}, new int[]{0, 3, -4, 12, -1}),
                Arguments.of("With sorted array", new int[]{1, 2, 3, 4, 0}, new int[]{2, 3, 4, 0, 1})
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    @DisplayName("Check for Positive Test Cases for O(n) solution")
    public void moveZerosEnd_Positive_Test(String description, int[] input, int[] expected){
        // Arrange
        // Act
        LeftRotateArrayByOne.leftRotateByOne(input);
        // Assert
        assertThat(input).as(description).containsExactly(expected);
    }

}