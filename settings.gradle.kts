rootProject.name = "compose"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

include(":composeApp")

include(":uicons-core")
project(":uicons-core").projectDir = file("uicons/core")

include(":uicons-brand")
project(":uicons-brand").projectDir = file("uicons/brand")

include(":uicons-bold-rounded")
project(":uicons-bold-rounded").projectDir = file("uicons/bold-rounded")

include(":uicons-bold-straight")
project(":uicons-bold-straight").projectDir = file("uicons/bold-straight")

include(":uicons-regular-chubby")
project(":uicons-regular-chubby").projectDir = file("uicons/regular-chubby")

include(":uicons-regular-rounded")
project(":uicons-regular-rounded").projectDir = file("uicons/regular-rounded")

include(":uicons-regular-straight")
project(":uicons-regular-straight").projectDir = file("uicons/regular-straight")

include(":uicons-solid-chubby")
project(":uicons-solid-chubby").projectDir = file("uicons/solid-chubby")

include(":uicons-solid-rounded")
project(":uicons-solid-rounded").projectDir = file("uicons/solid-rounded")

include(":uicons-solid-straight")
project(":uicons-solid-straight").projectDir = file("uicons/solid-straight")

include(":uicons-thin-chubby")
project(":uicons-thin-chubby").projectDir = file("uicons/thin-chubby")

include(":uicons-thin-rounded")
project(":uicons-thin-rounded").projectDir = file("uicons/thin-rounded")

include(":uicons-thin-straight")
project(":uicons-thin-straight").projectDir = file("uicons/thin-straight")
