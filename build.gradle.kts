import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val jUnitVersion = "5.7.1"
val mockkVersion = "1.11.+"
val koTestVersion = "4.5.+"

plugins {
    kotlin("jvm") version "1.5.0"
}

group = "de.tobiasgaenzler"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-csv:2.12.1")
    testImplementation("io.mockk:mockk:$mockkVersion")
    testImplementation("io.kotest:kotest-runner-junit5-jvm:$koTestVersion")
    testImplementation("io.kotest:kotest-assertions-core-jvm:$koTestVersion")
    testImplementation("io.kotest:kotest-property-jvm:$koTestVersion")
    testImplementation("io.kotest:kotest-assertions-json:$koTestVersion")
    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:$jUnitVersion")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$jUnitVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "15"
}
