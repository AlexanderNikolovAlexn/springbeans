package com.samodeika.spring.AnnotationConfiguration.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyBean implements BeanNameAware {

    private String beanName;

    public LazyBean() {
        System.out.println("Instantiating lazy bean!");
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
