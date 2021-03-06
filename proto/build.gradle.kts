import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.google.protobuf") version "0.8.17"
    java
    idea
    kotlin("jvm") version "1.5.31"
}

group = "com.szepep.mq"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

val protobufVersion = "3.18.0"

dependencies {
    compileOnly(libs.protobuf)
    implementation(kotlin("stdlib-jdk8"))
}

tasks.clean {
    protobuf {
        delete(generatedFilesBaseDir)
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:${protobufVersion}"
    }

    // makes IDEA not report missing classes, gradle build works without this
    generatedFilesBaseDir = "$projectDir/gen"

}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}