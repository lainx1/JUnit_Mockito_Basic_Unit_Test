package com.lain.calculator.preunittest

import org.junit.*

import org.junit.Assert.*

class CalculatorTest {

    private var calculator: Calculator ?= null;

    /*==============================================================================================
    SET UP
    ==============================================================================================*/
    @Before
    fun setUp(){
        calculator = Calculator()
    }

    /*==============================================================================================
    TEAR DOWN
    ==============================================================================================*/
    /**
     * Free memory resources
     */
    @After
    fun tearDown(){
        calculator = null
    }

    /*==============================================================================================
    TEST
    ==============================================================================================*/
    @Test
    fun calculatorNullTest(){
        assertNotNull("Here calculator is null.", calculator)
    }

    @Test
    fun add() {
        assertEquals("No es 15", 15, calculator!!.add(number1 = 10, number2 = 5))
        assertEquals("No es 15", 20, calculator!!.add(number1 = 10, number2 = 10))
    }

    @Test
    fun subtract() {
        assertEquals("No es 15", 5, calculator!!.subtract(number1 = 10, number2 = 5))
        assertEquals("No es 15", 0, calculator!!.subtract(number1 = 10, number2 = 10))
    }

    @Test
    fun divide_valid_input_valid_expected_result_test(){
        assertEquals(2, calculator!!.divide(number1 = 4, number2 = 2))
    }

    @Test
    fun divide_not_valid_input_valid_expected_result_test(){
        assertEquals("Division / Zero",2, calculator!!.divide(number1 = 4, number2 = 0))
    }

    @Test(expected = ArithmeticException::class)
    fun divide_by_zero_exception_expected_test(){
        calculator!!.divideByZero(number1 = 4, number2 = 0)
    }

    @Ignore("Not ready, waiting the division by zero fix.")
    @Test(expected = ArithmeticException::class)
    fun divide_by_zero_exception_expected_ignore_test(){
        calculator!!.divideByZero(number1 = 4, number2 = 0)
    }

    @Test(timeout = 600)
    fun high_duration_operation_test(){
        calculator!!.highDurationTest()
    }
}