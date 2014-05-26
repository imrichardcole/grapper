package com.imrichardcole.grapper;

import com.imrichardcole.grapper.extension.Java;
import com.imrichardcole.grapper.extension.LogFile;
import com.imrichardcole.grapper.extension.Windows;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

import java.io.IOException;
import java.util.List;

public class GrapperTask extends DefaultTask {

    @TaskAction
    public void grapperTask() throws IOException {
        final Java java = getExtensions().getByType(Java.class);
        final Windows windows = getExtensions().getByType(Windows.class);
        final LogFile logFile = getExtensions().getByType(LogFile.class);

        System.out.println(java);
        System.out.println(windows);
        System.out.println(logFile);
    }

}
