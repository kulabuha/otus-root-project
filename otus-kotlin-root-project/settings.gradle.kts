pluginManagement {
    val kotlinVersion :String by settings
            plugins {
                kotlin("jvm") version kotlinVersion apply false
            }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "otus-kotlin-root-project"

include("m1")