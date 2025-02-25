package com.newProject.learn_spring_framework_01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// record Person(String name,int age){};
record Person(String name,int age,Address address){};
record Address(String firstLine,String city){};

@Configuration
public class HelloWorldConfigurationSpring {
    @Bean
    public String name(){
        return "kangs";
    }
    @Bean
    public int age(){
        return 15;
    }
    @Bean
    public Person person(){
        return new Person("munu",20,new Address("Manhkuchi","Ghy"));
    }
    // @Bean
    // public Address address(){
    //     return new Address("Manhkuchi","Ghy");
    // }

    @Bean(name="address2")
    public Address address(){
        return new Address("Manhkuchi","Ghy");
    }
    
    @Bean(name="address3")
    @Primary
    public Address address3(){
        return new Address("ghy","Ghy");
    }
    @Bean
    public Person person2MethodCall(){//reusing existing methods
        return new Person(name(),age(),address());
    }
    @Bean
    public Person person3Parameters(String name,int age,Address address2){//reusing beans name as parameter=> autowiring with parameters
        return new Person(name,age,address2);
    }
}
