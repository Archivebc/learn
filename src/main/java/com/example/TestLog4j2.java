package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j2 {

    private static Logger logger = LoggerFactory.getLogger(TestLog4j2.class);

    public static void main(String[] args) {

        for (int i = 0; i < 100000000; i++) {
            logger.debug("Rolling file appender Debug");
            logger.warn("Rolling file appender WARN");
            logger.info("Rolling file appender INFO");
            logger.error("Rolling file appender ERROR");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
