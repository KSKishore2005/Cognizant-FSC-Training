package com.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingDemo {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingDemo.class);

    public static void main(String[] args) {
        String username = "kishore";
        int attempts = 3;

        logger.info("User {} has logged in.", username);
        logger.warn("User {} has tried {} times to access a restricted page.", username, attempts);
    }
}
