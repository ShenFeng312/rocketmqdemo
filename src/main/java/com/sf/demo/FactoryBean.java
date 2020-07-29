package com.sf.demo;

import org.springframework.context.annotation.Configuration;

//@Configuration
public class FactoryBean implements org.springframework.beans.factory.FactoryBean {
    @Override
    public Object getObject() throws Exception {
        Bean bean = new Bean();
        bean.afterPropertiesSet();
        return bean;
    }

    @Override
    public Class<?> getObjectType() {
        return Bean.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
