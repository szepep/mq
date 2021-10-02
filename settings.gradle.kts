rootProject.name = "mq"


include("producer", "proto", "model", "consumer")

enableFeaturePreview("VERSION_CATALOGS")

val kotlinLoggingVersion = "2.0.10"
val protobufVersion = "3.18.0"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            alias("protobuf").to("com.google.protobuf:protobuf-java:$protobufVersion")
            alias("logging").to("io.github.microutils:kotlin-logging-jvm:$kotlinLoggingVersion")
        }
    }
}