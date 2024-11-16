package com.aakash.dsa.maths;

import com.aakash.dsa.maths.complete.GCDorHCF;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HCForGCDTest {

    @ParameterizedTest
    @CsvSource({
            "125, 252, 1",
            "16, 20, 4",
           //"0, 0,0",
            "105, 258, 3",
            "258, 105, 3",
    })
    void shouldReturnGCDForV2_1(int inputX, int inputY, int expectedGCD){
        // Arrange
        // Act
        int actual = GCDorHCF.gcdV2_1(inputX, inputY);

        // Assert
        assertEquals(expectedGCD, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "125, 252, 1",
            "16, 20, 4",
         //   "0, 0,0",
            "105, 258, 3",
            "258, 105, 3",
    })
    void shouldReturnGCDForV3_1(int inputX, int inputY, int expectedGCD){
        // Arrange
        // Act
        int actual = GCDorHCF.gcdV3(inputX, inputY);

        // Assert
        assertEquals(expectedGCD, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "125, 252, 1",
            "16, 20, 4",
            //"0, 0,0",
            "105, 258, 3",
            "258, 105, 3",
    })
    void shouldReturnGCDForV1_1(int inputX, int inputY, int expectedGCD){
        // Arrange
        // Ac
        int actual = GCDorHCF.gcdV1_1( inputX, inputY);

        // Assert
        assertEquals(expectedGCD, actual);
    }


}