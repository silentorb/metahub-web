plugins {
    base
}

subprojects {
    group = "silentorb.metahub"
    version = "1.0-SNAPSHOT"

    repositories {
        maven("https://kotlin.bintray.com/kotlin-js-wrappers/")
        mavenCentral()
        jcenter()
    }

}
