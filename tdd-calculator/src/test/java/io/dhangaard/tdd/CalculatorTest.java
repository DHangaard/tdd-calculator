package io.dhangaard.tdd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }


    // Create instance of calculator
    Calculator calc = new Calculator();

    @Test
    @DisplayName("Integer addition, a + b")
    public void addTest(){
        // Arrange
        int expected = 10;

        // Act
        int actual = calc.add(7, 3);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Integer subtraction, a - b")
    public void subTest(){
        int expected = 7;
        int actual = calc.sub(10, 3);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Integer multiplication, a * b")
    public void mulTest(){
        int expected = 10;
        int actual = calc.mul(5, 2);
        assertEquals(expected, actual);
    }


    @AfterEach
    void tearDown() {
    }
}