import com.google.protobuf.gradle.generateProtoTasks
import com.google.protobuf.gradle.protobuf
import com.google.protobuf.gradle.protoc

plugins {
    java
    id("com.google.protobuf") version "0.8.17"
}

group = "com.szepep.mq"
java.sourceCompatibility = JavaVersion.VERSION_11

val protobufVersion = "3.18.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("com.google.protobuf:protobuf-java:${protobufVersion}")
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:${protobufVersion}"
    }
//    generatedFilesBaseDir = "$projectDir/gen"

    generateProtoTasks {

    }
}