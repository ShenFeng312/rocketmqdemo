package com.sf.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Bean implements InitializingBean {
    @Override
    @Scheduled(fixedDelay=200)
    public void afterPropertiesSet() throws Exception {
        System.out.printf("created");
    }
}
