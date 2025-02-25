package com.newProject.learn_spring_framework_02.Examples.a7;

import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLConfigurationContextLauncherApplication {
    public static void main(String[] args) {
        try(var context= new ClassPathXmlApplicationContext("contextConfiguration.xml")){
            
            Arrays.stream(context.getBeanDefinitionNames())
                  .forEach(System.out::println);

            System.out.println(context.getBean("name"));
        }
    }
}
