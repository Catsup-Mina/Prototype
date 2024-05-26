// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    id("com.android.library") version "8.1.1" apply false
    kotlin("kapt") version "2.0.0"
    id("org.jetbrains.kotlin.jvm") version "1.7.0" apply false
}