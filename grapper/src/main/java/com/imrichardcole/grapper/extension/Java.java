package com.imrichardcole.grapper.extension;

import java.util.List;

public class Java {


    private String mainClass;
    private String initMemory;
    private String maxMemory;
    private List<String> classpath;
    private String libraryPath;
    private List<String> additional;

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public String getInitMemory() {
        return initMemory;
    }

    public void setInitMemory(String initMemory) {
        this.initMemory = initMemory;
    }

    public String getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(String maxMemory) {
        this.maxMemory = maxMemory;
    }

    public List<String> getClasspath() {
        return classpath;
    }

    public void setClasspath(List<String> classpath) {
        this.classpath = classpath;
    }

    public String getLibraryPath() {
        return libraryPath;
    }

    public void setLibraryPath(String libraryPath) {
        this.libraryPath = libraryPath;
    }

    public List<String> getAdditional() {
        return additional;
    }

    public void setAdditional(List<String> additional) {
        this.additional = additional;
    }

    @Override
    public String toString() {
        return "Java {" +
                "mainClass='" + mainClass + '\'' +
                ", initMemory='" + initMemory + '\'' +
                ", maxMemory='" + maxMemory + '\'' +
                ", classpath='" + classpath + '\'' +
                ", libraryPath='" + libraryPath + '\'' +
                ", additional='" + additional + '\'' +
                '}';
    }

}
