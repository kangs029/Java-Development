package com.newProject.learn_spring_framework_01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02helloWorldSpring {
    public static void main(String[] args) {
        //1. Launch a Spring context

        try(var context=
                new AnnotationConfigApplicationContext(HelloWorldConfigurationSpring.class)){// to remove the warning context is not closed we can use try with resources like in AppGamingSpringBeans file
        //2. Congigure the things that we want Spring to manage - 
        //use configuration class-HelloWorldConfiguration @Configuration
        //Method name -@Bean

        //3. Retrieving Beans managed by spring
        System.out.println(context.getBean("name"));//"" is the method name
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameters"));

        System.out.println(context.getBean(Address.class));
                };
        
    }
}
