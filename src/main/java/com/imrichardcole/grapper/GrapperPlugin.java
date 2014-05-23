package com.imrichardcole.grapper;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GrapperPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        final GrapperTask grabberTask = project.getTasks().create("grapper", GrapperTask.class);
        grabberTask.setGroup("Grapper");
        grabberTask.setDescription("generate a wrapper script");
    }

}
