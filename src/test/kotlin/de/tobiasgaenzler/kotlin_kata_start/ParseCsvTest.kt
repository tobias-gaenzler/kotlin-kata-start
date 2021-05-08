package de.tobiasgaenzler.kotlin_kata_start

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import java.io.File

class ParseCsvTest : FunSpec({
    context("parsing csv") {
        test("returns a person") {
            val csvFile = File("src/test/resources/person.csv")

            val person = ParseCsv().parseCsv(csvFile)
            person.firstName shouldBe "John"
            person.lastName shouldBe "Doe"
            person.family shouldBe true

        }
    }
})