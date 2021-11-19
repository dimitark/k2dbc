plugins {
    kotlin("jvm") version "1.6.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.github.microutils:kotlin-logging-jvm:2.0.11")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2-native-mt")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactive:1.5.2-native-mt")
    implementation("io.r2dbc:r2dbc-spi:0.9.0.RC1")

    testImplementation(kotlin("test"))
    testImplementation("org.slf4j:slf4j-simple:1.7.32")
    testImplementation("io.r2dbc:r2dbc-h2:0.9.0.M1")
}

tasks.test {
    useJUnitPlatform()
}
