plugins {
    id("java")
    id("com.gorylenko.gradle-git-properties") version "2.4.2"
}

group = "org.demo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

/*
gitProperties {
    dotGitDirectory = project.rootProject.layout.projectDirectory.dir(".git")
}
*/
