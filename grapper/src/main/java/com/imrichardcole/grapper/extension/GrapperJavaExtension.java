package com.imrichardcole.grapper.extension;

public class GrapperJavaExtension {

    private String initMemory;
    private String maxMemory;

    public void setInitMemory(String initMemory) {
        this.initMemory = initMemory;
    }

    public void setMaxMemory(String maxMemory) {
        this.maxMemory = maxMemory;
    }

    public String getInitMemory() {
        return initMemory;
    }

    public String getMaxMemory() {
        return maxMemory;
    }

}
