package com.example.springcloudbatchtaskdemo.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldApplicationRunner implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("===========================================");
        logger.info("Hello World from Spring Cloud Task!");
        logger.info("===========================================");
    }
}
