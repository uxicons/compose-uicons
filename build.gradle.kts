plugins {
    alias(libs.plugins.composeHotReload) apply false
    alias(libs.plugins.composeMultiplatform) apply false
    alias(libs.plugins.composeCompiler) apply false
    alias(libs.plugins.kotlinMultiplatform) apply false
    `maven-publish`
    signing
}

allprojects {
    group = "io.github.uxicons"
    version = "1.0.0"
}

subprojects {
    if (project.name != "composeApp") {
        apply(plugin = "maven-publish")
        apply(plugin = "signing")

        afterEvaluate {
            extensions.configure<PublishingExtension> {
                repositories {
                    maven {
                        name = "MavenCentral"
                        url = uri("https://central.sonatype.com/api/v1/publisher/upload?publishingType=AUTOMATIC")
                        credentials {
                            username = findProperty("mavenCentralUsername") as String?
                            password = findProperty("mavenCentralPassword") as String?
                        }
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

            extensions.configure<SigningExtension> {
                sign(extensions.getByType<PublishingExtension>().publications)
            }
        }
    }
}