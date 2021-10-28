plugins {
    java
    kotlin("jvm") version "1.5.30"
}

group = "com.polbeng"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
}
