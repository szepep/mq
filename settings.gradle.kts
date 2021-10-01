rootProject.name = "mq"


include("producer", "proto")

enableFeaturePreview("VERSION_CATALOGS")

val protobufVersion = "3.18.0"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            alias("protobuf").to("com.google.protobuf:protobuf-java:${protobufVersion}")
        }
    }
}