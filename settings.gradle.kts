rootProject.name = "metahub"

val addProject = { name: String ->
    include(name)
    project(":$name").projectDir = java.io.File("modules/$name")
}

//addProject("app")
//addProject("server")
includeBuild("modules/server")
