package Calc;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TestCalculator {

    Calculator calculator = new Calculator();

    @Test
    public void Should_add_two_numbers_and_return_result() {
        int expectedResult = 2 + 3;
        int actualResult = calculator.add(2,3);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Should_substract_two_numbers_and_return_result() {
        int expectedResult = 4 - 3;
        int actualResult = calculator.sub(4,3);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Should_multiply_two_numbers_and_return_result() {
        int expectedResult = 3 * 3;
        int actualResult = calculator.multiply(3,3);

        Assert.assertEquals(expectedResult, actualResult);
        // Implement
    }

    @Test
    public void Should_divide_two_numbers_and_return_result() {
        float expectedResult = 9 / 3;
        float actualResult = calculator.divide(9,3);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
        ArithmeticException thrown = Assertions
                .assertThrows(ArithmeticException.class, () -> {
                    calculator.divide(1, 0);
                });
        Assertions.assertEquals("ZeroDivisionError", thrown.getMessage());
    }
}