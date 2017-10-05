package com.samodeika.spring.AnnotationConfiguration.beans;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class EagerBean implements BeanNameAware {

    private String beanName;

    public EagerBean() {
        System.out.println("Instantiating eager bean!");
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
