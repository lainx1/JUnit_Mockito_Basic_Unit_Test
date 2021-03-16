package com.lain.calculator.tdd

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class FizzBuzzTest{
    //Escribir la historia de usuario

    lateinit var fizzBuzz: FizzBuzz

    @Before
    fun setUp(){
        fizzBuzz = FizzBuzz()
    }

    @Test
    fun of_0_is_0(){
        assertEquals("0", fizzBuzz.of(0))
    }

    @Test
    fun of_1_is_1(){
        assertEquals("1", fizzBuzz.of(1))
    }

    @Test
    fun of_2_is_2(){
        assertEquals("2", fizzBuzz.of(2))
    }

    @Test
    fun of_3_is_fizz(){
        assertEquals("fizz", fizzBuzz.of(3))
    }

    @Test
    fun of_5_is_buzz(){
        assertEquals("buzz", fizzBuzz.of(5))
    }

    @Test
    fun of_6_is_fizz(){
        assertEquals("fizz", fizzBuzz.of(6))
    }
    @Test
    fun of_10_is_buzz(){
        assertEquals("buzz", fizzBuzz.of(10))
    }

    @Test
    fun of_15_is_fizz_buzz(){
        assertEquals("fizz buzz", fizzBuzz.of(15))
    }

    @Test
    fun of_100_is_buzz(){
        assertEquals("buzz", fizzBuzz.of(100))
    }
}