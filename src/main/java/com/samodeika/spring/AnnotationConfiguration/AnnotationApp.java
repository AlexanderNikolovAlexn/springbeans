package com.samodeika.spring.AnnotationConfiguration;

import com.samodeika.spring.AnnotationConfiguration.beans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {

    static ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

    public static void main(String[] args) {

        // Test bean Instantiation
        //testBeanInstantiation();

        // Test bean Scopes
        // 1) Singleton scope - default one
        // 2) Prototype scope - new instance every time
        // 3) Request scope(Web only) - valid for the request only(until server sends the response)
        // 4) Session scope(Web only) - valid for user session only(during navigation of some website until you leave it/logout)
        testBeanScopes();
    }

    private static void testBeanScopes() {

        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);

        System.out.println("Are SingletonScopeBean instances the same: "
                + (singletonBean1 == singletonBean1));

        PrototypeScope prototypeScope1 = context.getBean(PrototypeScope.class);
        PrototypeScope prototypeScope2 = context.getBean(PrototypeScope.class);

        System.out.println("Are PrototypeScopeBean instances the same: "
                + (prototypeScope1 == prototypeScope2));
    }

    private static void testBeanInstantiation() {

        Dev dev = context.getBean(Dev.class);
        System.out.println(dev.getName());

        BeanProject beanProject = context.getBean(BeanProject.class);
        System.out.println(beanProject);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        LazyBean lazyBean = context.getBean(LazyBean.class);
        System.out.println(lazyBean.getBeanName());

        EagerBean eagerBean = context.getBean(EagerBean.class);
        System.out.println(eagerBean.getBeanName());

    }

}
