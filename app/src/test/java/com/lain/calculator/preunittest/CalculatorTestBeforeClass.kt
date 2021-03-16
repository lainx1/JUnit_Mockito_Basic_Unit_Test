package com.lain.calculator.preunittest

import org.junit.Assert
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import kotlin.properties.Delegates

class CalculatorTestBeforeClass {

    private lateinit var calculatorTestBefore : Calculator
    private var number1Before by Delegates.notNull<Int>()
    private var number2Before by Delegates.notNull<Int>()

    companion object{
        private lateinit var calculatorTestBeforeClass: Calculator
        private var number1BeforeClass by Delegates.notNull<Int>()
        private var number2BeforeClass by Delegates.notNull<Int>()

        init {

        }
        @BeforeClass
        @JvmStatic
        fun beforeClass(){

            calculatorTestBeforeClass = Calculator()
            number1BeforeClass = 3
            number2BeforeClass = 4

            print("Before class")
        }
    }


    @Before
    fun before(){
        calculatorTestBefore = Calculator()
        number1Before = 3
        number2Before = 4

        print("Before class")
    }

    @Test
    fun beforeTestVsBeforeClassTest(){
        number1BeforeClass += 3
        number2BeforeClass += 5

        number1Before += 5
        number1Before += 5

        Assert.assertEquals("Number 1 before class: ",6, number1BeforeClass )
        Assert.assertEquals("Number 2 before class: ",9, number2BeforeClass )

        Assert.assertEquals("Number 1 before class: ",6, number1Before )
        Assert.assertEquals("Number 2 before class: ",9, number2Before )

        print("Test before class")
    }


}