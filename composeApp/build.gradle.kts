import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.composeHotReload)
}

kotlin {
    jvm()

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.runtime)
            implementation(libs.compose.foundation)
            implementation(libs.compose.material3)
            implementation(libs.compose.ui)
            implementation(libs.compose.components.resources)
            implementation(libs.compose.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodelCompose)
            implementation(libs.androidx.lifecycle.runtimeCompose)
            // Icon packages (all 11 styles)
            implementation(project(":uicons-core"))
            implementation(project(":uicons-brand"))
            implementation(project(":uicons-bold-rounded"))
            implementation(project(":uicons-bold-straight"))
            implementation(project(":uicons-regular-chubby"))
            implementation(project(":uicons-regular-rounded"))
            implementation(project(":uicons-regular-straight"))
            implementation(project(":uicons-solid-chubby"))
            implementation(project(":uicons-solid-rounded"))
            implementation(project(":uicons-solid-straight"))
            implementation(project(":uicons-thin-chubby"))
            implementation(project(":uicons-thin-rounded"))
            implementation(project(":uicons-thin-straight"))
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutinesSwing)
        }
    }

    jvmToolchain(17)
}


compose.desktop {
    application {
        mainClass = "com.uxicons.compose.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.uxicons.compose"
            packageVersion = "1.0.0"
        }
    }
}
