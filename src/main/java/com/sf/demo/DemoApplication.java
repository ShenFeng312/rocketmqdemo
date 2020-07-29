package com.sf.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class DemoApplication implements CommandLineRunner, ApplicationContextAware {
//    @Autowired
//    RocketMQTemplate rocketMQTemplate;
    @Autowired
    ApplicationContext applicationContext;
    public static void main(String[] args) {
       SpringApplication.run(DemoApplication.class,args);
    }

    @Override
    public void run(String... args) {
//        rocketMQTemplate.convertAndSend("test-topic-1","hello");
        Annotation[] annotations = Bean.class.getAnnotations();
        Annotation[] declaredAnnotations = Bean.class.getDeclaredAnnotations();
        Bean bean = applicationContext.getBean(Bean.class);
        System.out.println(bean.getClass());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
}
