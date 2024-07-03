package com.aakash.dsa.arrays.instruction;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SecondLargestElementTest {

    public static Stream<Arguments> secondMax(){
        return Stream.of(
          Arguments.of(new int[]{1, 2, 1, 1, 1, 1, 1}, 1),
          Arguments.of(new int[]{1, 2, 3, 1, 1, 1, 1}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("secondMax")
    @DisplayName("Check for correct output")
    void secondMax_test(int[] arr, int expected) {
        // Arrange
        //Act
        int value = SecondLargestElement.secondMax(arr);
        // Assert
        assertThat(value).isEqualTo(expected);
    }
}