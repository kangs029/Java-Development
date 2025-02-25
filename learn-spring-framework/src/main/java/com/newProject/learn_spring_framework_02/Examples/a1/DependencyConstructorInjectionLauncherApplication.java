package com.newProject.learn_spring_framework_02.Examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
    //dependency constructor injection
   
    Dependency1 dependency1;

    Dependency2 dependency2;

    @Autowired//it is not madnatory for constructor injection
    YourBusinessClass(Dependency1 dependency1,Dependency2 dependency2){
        super();
        System.out.println("Constructor Injection - YourClassDependency");
        this.dependency1=dependency1;
        this.dependency2=dependency2;
    }

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
public class DependencyConstructorInjectionLauncherApplication {
    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(DependencyConstructorInjectionLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames())
                 .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }
        
    }

}
