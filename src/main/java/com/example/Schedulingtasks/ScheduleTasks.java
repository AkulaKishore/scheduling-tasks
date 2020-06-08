package com.example.Schedulingtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class ScheduleTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduleTasks.class);
    private static final SimpleDateFormat dateformat = new SimpleDateFormat("HH:MM:SS");

    @Scheduled(fixedRate = 5000)
     public void getCurrentTime(){
        log.info("current time is {}",dateformat.format(new Date()));
    }
}
