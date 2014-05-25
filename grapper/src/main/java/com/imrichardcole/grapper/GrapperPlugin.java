package com.imrichardcole.grapper;

import com.imrichardcole.grapper.extension.GrapperJavaExtension;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GrapperPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        final GrapperTask grapperTask = project.getTasks().create("grapper", GrapperTask.class);
        grapperTask.setGroup("Grapper");
        grapperTask.setDescription("generate a wrapper script");
        grapperTask.getExtensions().add("java", GrapperJavaExtension.class);
    }

}
