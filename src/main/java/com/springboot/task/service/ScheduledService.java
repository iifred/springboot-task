package com.springboot.task.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {
    /**
     *second（秒）, minute（分）, hour（时）, day of month（日每个月多少号）, month（月）, day of week（周）.
     */
//    @Scheduled(cron = "0 42 * * * MON-FRI")
    //    @Scheduled(cron = "0,1,2,3,4 * * * * MON-FRI") 0到4秒都执行
//    @Scheduled(cron = "0-4 * * * * MON-FRI")0到4秒都执行
    @Scheduled(cron = "0/4 * * * * MON-FRI")
    public void sendHello(){
        System.out.println("hello fred...");
    }
}
