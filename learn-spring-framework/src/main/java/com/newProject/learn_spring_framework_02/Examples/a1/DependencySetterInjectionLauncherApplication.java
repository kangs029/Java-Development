package com.newProject.learn_spring_framework_02.Examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class YourBusinessClass {
    //dependency setter injection
   
    Dependency1 dependency1;

    Dependency2 dependency2;

    @Autowired
    public void setDependecy1(Dependency1 dependency1){
        System.out.println("Setter Injection - setDependency1");
        this.dependency1=dependency1;
    }

    @Autowired
    public void setDependecy2(Dependency2 dependency2){
        System.out.println("Setter Injection - setDependency2");
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
public class DependencySetterInjectionLauncherApplication {
    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(DependencySetterInjectionLauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames())
                 .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }
        
    }

}
