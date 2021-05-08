package de.tobiasgaenzler.kotlin_kata_start

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.dataformat.csv.CsvMapper
import com.fasterxml.jackson.dataformat.csv.CsvSchema
import java.io.File

class ParseCsv {
    fun parseCsv(csvFile: File): Person {
        return CsvMapper()
            .readerFor(Person::class.java)
            .with(
                CsvSchema
                    .emptySchema()
                    .withHeader()
            )
            .readValues<Person?>(csvFile)
            .nextValue()
    }
}

class Person @JsonCreator constructor(
    @JsonProperty("First_Name")
    var firstName: String? = null,
    @JsonProperty("Last_Name")
    var lastName: String? = null
) {
    var family: Boolean = false

    @JsonSetter("Family")
    fun setFamily(family: String) {
        this.family = ("Wahr" == family)
    }
}

