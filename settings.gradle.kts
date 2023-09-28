rootProject.name = "nindzapro-currencies"

sequenceOf(
    "energy",
    "ninjacoins",
).forEach {
    include("currency-$it")
    project(":currency-$it").projectDir = file(it)
}

pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven("https://repo.jopga.me/releases")
    }
}