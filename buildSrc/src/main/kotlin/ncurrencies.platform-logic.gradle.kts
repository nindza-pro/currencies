plugins {
    id("ncurrencies.shadow-logic")
}

val Project.platform: String
    get() = project.name.split("-")[1]

tasks {
    shadowJar {
        archiveFileName.set("ncurrencies-${project.platform}-${project.version}.jar")
        destinationDirectory.set(rootProject.layout.buildDirectory.dir("libs"))
    }
}