package com.imrichardcole.grapper;

import com.imrichardcole.grapper.extension.Java;
import com.imrichardcole.grapper.extension.LogFile;
import com.imrichardcole.grapper.extension.Windows;
import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class GrapperPlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        final GrapperTask grapperTask = project.getTasks().create("grapper", GrapperTask.class);
        grapperTask.setGroup("Grapper");
        grapperTask.setDescription("generate a wrapper configuration file");
        grapperTask.getExtensions().add("java", Java.class);
        grapperTask.getExtensions().add("windows", Windows.class);
        grapperTask.getExtensions().add("logfile", LogFile.class);
    }

}
