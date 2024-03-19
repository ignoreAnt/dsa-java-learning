package com.aakash.dsa.arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumArrayTest {

    @BeforeAll
    static void setUp(){
        System.out.println("Setup");
    }

    @BeforeEach
    void setUpBeforeEach(){
        System.out.println("Before Each");
    }

    @Test
    @DisplayName("An Array returns a correct sum")
    void shouldReturnCorrectSumForAnArray(){
        // Arrange - Given
        int[] nums = new int[]{1, 2, 3};
        int expected = 6;

        // Act - When
        int actual = SumArray.sum(nums);

        // Assert - Then
        assertEquals(expected, actual);
        System.out.println("Test1");
    }


    @Test
    @DisplayName("An Empty Array returns zero sum")
    void shouldReturnZeroWhenArrayIsEmpty(){
        // Arrange
        int[] nums = new int[]{};
        int expected = 0;

        // Act
        int actual = SumArray.sum(nums);

        // Assert
        assertEquals(expected, actual);
        System.out.println("Test2");
    }

    @Test
    @DisplayName("When a array is given correct sum is returned")
    void shouldReturnCorrectSum() {
        // Arrange - Given
        int[] nums = new int[]{1, 2, 3};
        int expected = 6;

        // Act - When
        int actual = SumArray.sumv2(nums);

        // Assert - Then
        assertEquals(expected, actual);
        System.out.println("Test3");
    }

    @Test
    @DisplayName("When Array is empty sum is zero")
    void shouldReturnZeroWhenArrayEmpty(){
        // Arrange
        int[] nums = new int[]{};
        int expected = 0;

        // Act
        int actual = SumArray.sumv2(nums);

        // Assert
        assertEquals(expected, actual);
        System.out.println("Test4");
    }

    @AfterEach
    void tearDownEach(){
        System.out.println("Teach Down Each");
    }

    @AfterAll
    static void tearDown(){
        System.out.println("Tear Down");
    }
}