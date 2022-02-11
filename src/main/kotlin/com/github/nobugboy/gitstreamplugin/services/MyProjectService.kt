package com.github.nobugboy.gitstreamplugin.services

import com.intellij.openapi.project.Project
import com.github.nobugboy.gitstreamplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
