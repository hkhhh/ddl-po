package com.github.hkhhh.ddlpo.services

import com.intellij.openapi.project.Project
import com.github.hkhhh.ddlpo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
