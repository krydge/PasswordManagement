package com.OrangeDriver.logger;

public class KSLogger {
    //create a logger with 1 to many sinks,
    //a logger will have the normal five log levels: trace, info, warn, error, fatal
    private String[] sinks = {"","","","","","","","","",""};

    private void writeToSinks() {

    }

    public KSLogger(String[] Sinks) {
        for (int x = 0; x < Sinks.length; x++) {
            sinks[x] = Sinks[x];
        }
        for (String i : sinks)
            System.out.println(i);
    }

    public void trace() {

    }

    public void info() {

    }

    public void warn() {

    }

    public void error() {

    }

    public void fatal() {

    }

}
