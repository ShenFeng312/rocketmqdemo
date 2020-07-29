package com.sf.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanPost implements BeanPostProcessor, ApplicationContextAware {
    Bean bean;
    public BeanPost(Bean bean){
        this.bean=bean;
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(BeanPost.class+bean.getClass().toString()+"before");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println(BeanPost.class+bean.getClass().toString()+"after");
        return bean;
    }
}
