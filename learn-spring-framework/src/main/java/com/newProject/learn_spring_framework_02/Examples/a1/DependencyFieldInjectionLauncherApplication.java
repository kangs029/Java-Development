package com.newProject.learn_spring_framework_02.Examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//Field Dependency Explaination

@Component
class YourBusinessClass {
    //dependency injection
    @Autowired
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

    public String toString(){
        return "using " + dependency1 +" and "+dependency2;
    }
}

@Component
class Dependency1{

}

@Component
class Dependency2{

    
}

@Configuration
@ComponentScan
public class DependencyFieldInjectionLauncherApplication {
    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(DependencyFieldInjectionLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames())
                 .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }
        
    }

}
