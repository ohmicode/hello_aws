plugins {
    kotlin("jvm") version "2.0.21"
    id("org.jetbrains.kotlin.plugin.spring") version "2.0.21"
    id("org.springframework.boot") version "3.0.13"
    id("io.spring.dependency-management") version "1.1.6"
    application
}

group = "example.hello"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.springframework.boot:spring-boot-starter-web")

    testImplementation(kotlin("test"))
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

kotlin {
    compilerOptions {
        apiVersion.set(org.jetbrains.kotlin.gradle.dsl.KotlinVersion.KOTLIN_2_0)
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
    }
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("HelloApplication")
}
