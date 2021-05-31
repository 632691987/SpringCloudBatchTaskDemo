package com.example.springcloudbatchtaskdemo.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.task.listener.TaskExecutionListener;
import org.springframework.cloud.task.repository.TaskExecution;
import org.springframework.stereotype.Component;

@Component
public class TaskListener implements TaskExecutionListener {

    private final Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Override
    public void onTaskEnd(TaskExecution arg0) {
        LOGGER.info("===========================================");
        LOGGER.info("End of Task");
        LOGGER.info("===========================================");
    }

    @Override
    public void onTaskFailed(TaskExecution arg0, Throwable arg1) {

    }

    @Override
    public void onTaskStartup(TaskExecution arg0) {
        LOGGER.info("===========================================");
        LOGGER.info("Task Startup");
        LOGGER.info("===========================================");
    }
}