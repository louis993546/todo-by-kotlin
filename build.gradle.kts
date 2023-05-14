plugins {
    kotlin("jvm") version "1.8.20"
    application
}

buildscript {
    dependencies {
        classpath(kotlin("gradle-plugin", version = "1.8.20"))
    }
}

group = "com.louis993546"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}

application {
    mainClass.set("MainKt")
}