package com.newProject.Real_Project;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldSpringProjectLaunch {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(RealWorldSpringProjectLaunch.class)){
            Arrays.stream(context.getBeanDefinitionNames())
                   .forEach(System.out::println);;
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
            
        }
    }
    
}
