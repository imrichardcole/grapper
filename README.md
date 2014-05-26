## Grapper

A gradle plugin for working with [Tanuki's Java Service Wrapper](http://wrapper.tanukisoftware.com/doc/english/download.jsp) 

## Introduction

This plugin enables you to dynamically generate `wrapper.conf` files that are use to configure JSW applications.  The
functionality is captured in a simple to usl DSL.

## Example Usage

    apply plugin: 'grapper'
    
    grapper {
        java {
            mainClass = 'com.imrichardcole.SuperApp'
            initMemory = 512
            maxMemory = 512
            classpath = ['foo.jar', 'bar.jar']
            libraryPath = ['', '']
            additional = ['one', 'two', 'three']
        }
        windows {
            name = 'My Service'
            displayName = ''
            description = ''
        }
        logfile {
            logfile = 'wrapper.log'
            format = 'LPTM'
            loglevel = 'INFO'
            // these can be defaulted to 0 if missing
            maxsize = 0
            maxfiles = 0
        }
    }
    
## Getting Help
    
If you have any questions, please feel free to raise them via the GitHub pages.
    
* Project Page: [https://github.com/imrichardcole/grapper](https://github.com/imrichardcole/grapper)
* Questions/Bugs: [https://github.com/imrichardcole/grapper/issues](https://github.com/imrichardcole/grapper/issues)
