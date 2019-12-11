package com.springboot.task.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service("hservice")
public class HelloService {
    /**
     * 告诉spring这是一个异步方法
     */
    @Async
    public void sendHello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("处理输出中");
    }
}
