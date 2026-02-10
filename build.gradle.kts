plugins {
    // this is necessary to avoid the plugins to be loaded multiple times
    // in each subproject's classloader
    alias(libs.plugins.composeHotReload) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
}

subprojects {
    apply(plugin = "maven-publish")

    configure<PublishingExtension> {
        repositories {
            maven {
                url = uri(layout.buildDirectory.dir("repo"))
            }
        }

        publications.withType<MavenPublication> {
            pom {
                name.set(project.name)
                description.set("Uicons library for Jetpack Compose Multiplatform")
                url.set("https://github.com/uicons/compose-uicons")
                licenses {
                    license {
                        name.set("Creative Commons Attribution 4.0 International")
                        url.set("https://creativecommons.org/licenses/by/4.0/")
                    }
                }
                developers {
                    developer {
                        id.set("uicons")
                        name.set("Uicons Team")
                        email.set("info@uicons.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/uicons/compose-uicons.git")
                    developerConnection.set("scm:git:ssh://github.com/uicons/compose-uicons.git")
                    url.set("https://github.com/uicons/compose-uicons")
                }
            }
        }
    }
}