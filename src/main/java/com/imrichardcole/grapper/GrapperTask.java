package com.imrichardcole.grapper;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class GrapperTask extends DefaultTask {

    //@Input
    String grabberName;

    @TaskAction
    public void fooTask() {
        System.out.println("Hello from fooTask " + grabberName);
    }

    public void grabberName(String test) {
        grabberName = test;
    }

}
