package com.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JLoggerDemo {
    private static final Logger logger = LoggerFactory.getLogger(SLF4JLoggerDemo.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
    }
}
