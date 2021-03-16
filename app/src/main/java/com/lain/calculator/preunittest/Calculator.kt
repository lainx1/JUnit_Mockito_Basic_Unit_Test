package com.lain.calculator.preunittest

class Calculator {

    fun add(number1: Int, number2: Int) = number1 + number2

    fun subtract(number1: Int, number2: Int) = number1 - number2

    fun divide(number1: Int, number2: Int) = number1 / number2

    fun divideByZero(number1: Int, number2: Int): Int{
        if(number2==0)
            throw ArithmeticException("Can't be divided by zero.")

        return number1 / number2;
    }

    fun highDurationTest(){
        Thread.sleep(800).run {

        }
    }
}