package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MultiAppenderLoggingDemo {
    private static final Logger logger = LoggerFactory.getLogger(MultiAppenderLoggingDemo.class);

    public static void main(String[] args) {
        logger.info("This is an info message.");
        logger.error("This is an error message.");
        logger.warn("This is a warning message.");
    }
}
