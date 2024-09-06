@file:Suppress("DSL_SCOPE_VIOLATION")

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        // gradlew generateProjectDependencyGraph
        classpath(libs.gradle.dependency.graph.generator.plugin)
    }
}
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.compose.compiler) apply false
    alias(libs.plugins.gms) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.ksp) apply false
    alias(libs.plugins.kotlin.jvm) apply false
}

apply(plugin="com.vanniktech.dependency.graph.generator")