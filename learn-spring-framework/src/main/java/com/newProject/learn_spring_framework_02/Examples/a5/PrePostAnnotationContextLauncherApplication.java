package com.newProject.learn_spring_framework_02.Examples.a5;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency=someDependency;
        System.out.println("All dependencies are ready");//dependencies are wired
    }

    @PostConstruct
    public void intialize(){
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp(){
        System.out.println("Clean up !");
    }
}    
        
@Component
class SomeDependency{
        
    public void getReady() {
        System.out.println("Some Logic using someDependency");
    }

}

@Configuration
@ComponentScan
public class PrePostAnnotationContextLauncherApplication {
    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(PrePostAnnotationContextLauncherApplication.class)){
            
            Arrays.stream(context.getBeanDefinitionNames())
                  .forEach(System.out::println);
        }
    }
}
