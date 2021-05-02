package com.github.derdan.intelhex.services

import com.github.derdan.intelhex.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
