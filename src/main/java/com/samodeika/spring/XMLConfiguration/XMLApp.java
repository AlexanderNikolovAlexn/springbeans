package com.samodeika.spring.XMLConfiguration;

import com.samodeika.spring.XMLConfiguration.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLApp {

    static ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

    public static void main(String[] args) {

        // Test bean Instantiation
        testBeanInstantiation();

        // Test bean Scopes
        // 1) Singleton scope - default one
        // 2) Prototype scope - new instance every time
        // 3) Request scope(Web only) - valid for the request only(until server sends the response)
        // 4) Session scope(Web only) - valid for user session only(during navigation of some website until you leave it/logout)
        //testBeanScopes();
    }

    private static void testBeanScopes() {

        SingletonScopeBean singletonScopeBean1 = context.getBean(SingletonScopeBean.class);
        SingletonScopeBean singletonScopeBean2 = context.getBean(SingletonScopeBean.class);

        System.out.println("Are SingletonScopeBean instances the same: "
                + (singletonScopeBean1 == singletonScopeBean2));

        PrototypeScopeBean prototypeScopeBean1 = context.getBean(PrototypeScopeBean.class);
        PrototypeScopeBean prototypeScopeBean2 = context.getBean(PrototypeScopeBean.class);

        System.out.println("Are PrototypeScopeBean instances the same: "
                + (prototypeScopeBean1 == prototypeScopeBean2));
    }

    private static void testBeanInstantiation() {
        BeanA beanA = context.getBean(BeanA.class);
        beanA.printMe();

        BeanB anotherBeanB = context.getBean("alexBean", BeanB.class);
        anotherBeanB.printMe();
        System.out.println(anotherBeanB.getName());

        InnerBean innerBean = context.getBean(InnerBean.class);
        innerBean.getBeanB().printMe();

        CalendarBean calendarBean = context.getBean("constructorInstance", CalendarBean.class);
        System.out.println(calendarBean.getTime());

        CalendarBean factoryCalendarBean = context.getBean("factoryCalendarBean", CalendarBean.class);
        System.out.println(factoryCalendarBean.getTime());

        System.out.println("Are CalendarBeans the same: " + (calendarBean == factoryCalendarBean));

        CollectionBean collectionBean = context.getBean("collectionBean", CollectionBean.class);

        System.out.println(collectionBean.getList());
        System.out.println(collectionBean.getMap());
        System.out.println(collectionBean.getSet());
        System.out.println(collectionBean.getProperties());
    }

}
