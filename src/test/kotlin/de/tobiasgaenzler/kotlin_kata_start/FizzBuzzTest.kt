package de.tobiasgaenzler.kotlin_kata_start

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FizzBuzzTest : FunSpec({

    context("FizzBuzz") {
        val fizzBuzz = FizzBuzz()
        test("Should return number if not divisible by 3 or 5") {
            listOf(
                1, 2, 4, 7, 8, 11, 13, 14, 16, 17, 19, 22, 23, 26, 28, 29, 31, 32, 34, 37, 38, 41, 43, 44, 46, 47, 49,
                52, 53, 56, 58, 59, 61, 62, 64, 67, 68, 71, 73, 74, 76, 77, 79, 82, 83, 86, 88, 89, 91, 92, 94, 97, 98
            ).forEach { number ->
                fizzBuzz.translateNumberToFizzBuzz(number) shouldBe number.toString()
            }
        }

        test("Should return Fizz if divisible by 3 and not by 5") {
            listOf(
                3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99
            ).forEach { number ->
                fizzBuzz.translateNumberToFizzBuzz(number) shouldBe "Fizz"
            }
        }

        test("Should return Buzz if divisible by 5 and not by 3") {
            listOf(
                5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100
            ).forEach { number ->
                fizzBuzz.translateNumberToFizzBuzz(number) shouldBe "Buzz"
            }
        }

        test("Should return FizzBuzz if divisible by 5 and by 3") {
            listOf(
                15, 30, 45, 60, 75, 90
            ).forEach { number ->
                fizzBuzz.translateNumberToFizzBuzz(number) shouldBe "FizzBuzz"
            }
        }
    }
})