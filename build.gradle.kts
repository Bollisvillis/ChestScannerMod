pluginManagement {
    repositories {
        maven(url = "https://maven.fabricmc.net/")
        gradlePluginPortal()
    }
}

plugins {
    id("fabric-loom") version "1.6.12"
    java
}

group = "net.dinmod"
version = "1.0.0"

repositories {
    mavenCentral()
    maven(url = "https://maven.fabricmc.net/")
}

dependencies {
    minecraft("com.mojang:minecraft:1.21.5")
    mappings("net.fabricmc:yarn:1.21.5+build.1:v2")
    modImplementation("net.fabricmc:fabric-api:fabric-api-0.98.0+1.21.5")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}
