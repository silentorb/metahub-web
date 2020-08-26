plugins {
    id("org.jetbrains.kotlin.js") version "1.4.0"
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

//kotlin.target.nodejs { }

kotlin {
    js {
        browser {
        }
        binaries.executable()
    }
}
