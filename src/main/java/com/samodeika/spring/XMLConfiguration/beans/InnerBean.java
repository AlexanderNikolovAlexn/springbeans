package com.samodeika.spring.XMLConfiguration.beans;

/**
 * Created by Alexander Nikolov on 3.10.2017 г..
 */
public class InnerBean {

    private int age;
    private BeanB beanB;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BeanB getBeanB() {
        return beanB;
    }

    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
    }

    @Override
    public String toString() {
        return "InnerBean{" +
                "age=" + age +
                ", beanB=" + beanB +
                '}';
    }
}
