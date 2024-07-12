package com.aakash.dsa.arrays.instruction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MoveZerosToEndTest {

    public static Stream<Arguments> testCases(){
        return Stream.of(
                Arguments.of(new int[]{}, new int[]{}), // empty array
                Arguments.of(new int[]{0}, new int[]{0}), // single element array with zero
                Arguments.of(new int[]{1}, new int[]{1}), // single element array with non-zero
                Arguments.of(new int[]{0,0,0}, new int[]{0,0,0}), // all zeros
                Arguments.of(new int[]{0, 1, 2, 3, 0}, new int[]{1, 2, 3, 0, 0}), // zeros at start and end
                Arguments.of(new int[]{1, 2, 3, 0, 0}, new int[]{1, 2, 3, 0, 0}), // zeros at end
                Arguments.of(new int[]{1, 0, 3, 0, 12}, new int[]{1, 3, 12, 0, 0}), // zeros in middle
                Arguments.of(new int[]{0, 0, 1, 0, 3}, new int[]{1, 3, 0, 0, 0}), // zeros at start and middle
                Arguments.of(new int[]{1, 0}, new int[]{1, 0}), // single zero
                Arguments.of(new int[]{100, 0, -5, 0, 20}, new int[]{100, -5, 20, 0, 0}), // with large numbers
                Arguments.of(new int[]{-1, 0, 3, -4, 12}, new int[]{-1, 3, -4, 12, 0}), // with negative numbers
                Arguments.of(new int[]{1, 2, 3, 4, 0}, new int[]{1, 2, 3, 4, 0}) // with sorted array
        );
    }

    @ParameterizedTest
    @MethodSource("testCases")
    @DisplayName("Check for Positive Test Cases for O(n^2) solution")
    public void moveZerosEnd_Positive_Test(int[] input, int[] expected){
        // Arrange
        // Act
        MoveZerosToEnd.removeZerosToEnd(input);
        // Assert
        assertThat(input).containsExactly(expected);
    }

    @ParameterizedTest
    @MethodSource("testCases")
    @DisplayName("Check for Positive Test Cases for O(n) solution")
    public void moveZerosEndV2_Positive_Test(int[] input, int[] expected){
        // Arrange
        // Act
        MoveZerosToEnd.removeZerosToEndV2(input);
        // Assert
        assertThat(input).containsExactly(expected);
    }

}