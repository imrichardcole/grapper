package com.imrichardcole.grapper;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GrapperTask extends DefaultTask {

    @Input
    String mainClassName;

    @TaskAction
    public void grapperTask() throws IOException {
        System.out.println("mainClassName = " + mainClassName);
        Properties wrapper = new Properties();
        final FileOutputStream conf = new FileOutputStream("wrapper.conf");
        wrapper.setProperty("wrapper.java.mainclass", mainClassName);
        wrapper.setProperty("wrapper.java.command", "java");


        wrapper.store(conf, null);
    }

    public void setMainClassName(String mainClassName) {
        this.mainClassName = mainClassName;
    }

}
