plugins {
    id("org.jetbrains.kotlin.js")
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

kotlin.target.nodejs { }
