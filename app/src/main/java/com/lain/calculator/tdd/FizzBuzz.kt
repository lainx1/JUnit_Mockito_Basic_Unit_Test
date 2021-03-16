package com.lain.calculator.tdd

class FizzBuzz {
    fun of(number: Int): String?{

        return when {
            number == 0 -> number.toString()
            number%3 == 0 && number%5==0 -> "fizz buzz"
            number%3 == 0 -> "fizz"
            number%5 == 0 -> "buzz"
            else -> number.toString()
        }

    }
}