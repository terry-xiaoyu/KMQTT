
allprojects {
    repositories {
        mavenCentral()
    }
}

buildscript {
    dependencies {
        classpath("org.jetbrains.kotlinx:atomicfu-gradle-plugin:0.27.0")
    }
}

plugins {
    id("com.vanniktech.maven.publish") version "0.35.0" apply false
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.goncalossilva.resources)
}

subprojects {
    group = "io.github.terry-xiaoyu"
    version = "1.0.0.1"
}
