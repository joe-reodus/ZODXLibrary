plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.library").version("7.4.2").apply(false)
    kotlin("multiplatform").version("1.8.10").apply(false)
    id("org.jetbrains.kotlin.plugin.serialization") version "1.5.31"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
