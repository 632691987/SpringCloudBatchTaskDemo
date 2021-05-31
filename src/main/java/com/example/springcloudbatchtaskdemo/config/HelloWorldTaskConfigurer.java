package com.example.springcloudbatchtaskdemo.config;

import org.springframework.cloud.task.configuration.DefaultTaskConfigurer;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class HelloWorldTaskConfigurer extends DefaultTaskConfigurer {

    public HelloWorldTaskConfigurer(DataSource dataSource) {
        super(dataSource);
    }

}
