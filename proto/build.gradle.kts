import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc

plugins {
    id("com.google.protobuf") version "0.8.17"
    java
    idea
}

group = "com.szepep.mq"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

val protobufVersion = "3.18.0"

dependencies {
    compileOnly(libs.protobuf)
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
