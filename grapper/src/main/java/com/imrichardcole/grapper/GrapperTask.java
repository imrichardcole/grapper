package com.imrichardcole.grapper;

import com.imrichardcole.grapper.extension.GrapperJavaExtension;
import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class GrapperTask extends DefaultTask {

    String mainClassName;
    List<String> additionals;

    @TaskAction
    public void grapperTask() throws IOException {
        Properties wrapper = new Properties();
        final FileOutputStream conf = new FileOutputStream("wrapper.conf");
        wrapper.setProperty("wrapper.java.mainclass", mainClassName);
        wrapper.setProperty("wrapper.java.command", "java");
        handleAdditional(wrapper, additionals);
        wrapper.store(conf, null);
        final GrapperJavaExtension java = getExtensions()
                .getByType(GrapperJavaExtension.class);
        System.out.println(java.getInitMemory());
        System.out.println(java.getMaxMemory());
    }

    private void handleAdditional(Properties wrapper,
                                  List<String> additionals) {
        int counter = 1;
        for (String additional : additionals) {
            wrapper.setProperty("java.wrapper.additional." + counter, additional);
            counter++;
        }
    }

    @Input
    public void setMainClassName(String mainClassName) {
        this.mainClassName = mainClassName;
    }

    @Input
    public void setAdditional(List<String> additionals) {
        this.additionals = additionals;
    }

    @Input
    public void setInitMemory(int initMemory) {
        System.out.println("initMemory = " + initMemory);
    }

    @Input
    public void setMaxMemory(int maxMemory) {
        System.out.println("maxMemory = " + maxMemory);
    }

}
