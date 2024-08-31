package com.example.ais.obj;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class LifeCycle implements BeanFactoryAware, BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is : " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory is : " + beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context : " + applicationContext);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean with after PropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Mama Yanawa Bye");
    }
}
