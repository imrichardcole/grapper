package com.imrichardcole.grapper.extension;

public class LogFile {

    private String logfile;
    private String format;
    private String loglevel;
    private String maxsize;
    private String maxfiles;

    public String getLogfile() {
        return logfile;
    }

    public void setLogfile(String logfile) {
        this.logfile = logfile;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLoglevel() {
        return loglevel;
    }

    public void setLoglevel(String loglevel) {
        this.loglevel = loglevel;
    }

    public String getMaxsize() {
        return maxsize;
    }

    public void setMaxsize(String maxsize) {
        this.maxsize = maxsize;
    }

    public String getMaxfiles() {
        return maxfiles;
    }

    public void setMaxfiles(String maxfiles) {
        this.maxfiles = maxfiles;
    }

    @Override
    public String toString() {
        return "LogFile {" +
                "logfile='" + logfile + '\'' +
                ", format='" + format + '\'' +
                ", loglevel='" + loglevel + '\'' +
                ", maxsize='" + maxsize + '\'' +
                ", maxfiles='" + maxfiles + '\'' +
                '}';
    }

}
