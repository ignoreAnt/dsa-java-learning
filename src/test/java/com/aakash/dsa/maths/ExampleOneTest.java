package com.aakash.dsa.maths;

import com.aakash.dsa.maths.instructions.ExampleOne;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ExampleOneTest {

    @ParameterizedTest
    @CsvSource({
            "32, 32",
            "-42, 42",
            "0, 0",
    })
    void shouldReturnCorrectAbsoluteValue(int input, int expected){
        // Arrange
        // Act
        int actual = ExampleOne.absolute(input);

        // Assert
        assertEquals(expected, actual);
    }

}