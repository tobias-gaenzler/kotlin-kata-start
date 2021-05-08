package de.tobiasgaenzler.kotlin_kata_start

import java.util.stream.IntStream

/**
 * See https://codingdojo.org/kata/FizzBuzz/
 */
class FizzBuzz {
    fun run() {
        IntStream.range(1, 101).forEach { number: Int -> println(translateNumberToFizzBuzz(number)) }
    }

    fun translateNumberToFizzBuzz(number: Int): String {
        return when {
            number % 15 == 0 -> {
                "FizzBuzz"
            }
            number % 3 == 0 -> {
                "Fizz"
            }
            number % 5 == 0 -> {
                "Buzz"
            }
            else -> {
                number.toString()
            }
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            FizzBuzz().run()
        }
    }
}