package com.newProject.learn_spring_framework_02.Examples.a3;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class A{

}

@Component
@Lazy
class B{
    @SuppressWarnings("unused")
    private A a1;

    public B(A a1){
        System.out.println("Some Logic");
        this.a1=a1;
    }
}

@Configuration
@ComponentScan
public class LaziInitializationLauncherApplication {
    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(LaziInitializationLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames())
                  .forEach(System.out::println);
        }
    }
}
