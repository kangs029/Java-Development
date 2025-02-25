package com.newProject.learn_spring_framework_02.Examples.a6;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessSevice{
    private DataService dataService;

    
    //@Autowired
    @Inject
    public void SetDataService(DataService dataService){
        this.dataService=dataService;
    }
    public DataService getDataService(){
        System.out.println("Setter Injection perfomed.");
        return dataService;
    }
    
}    
        
//@Component
@Named
class DataService{
        

}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {
    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)){
            
            Arrays.stream(context.getBeanDefinitionNames())
                  .forEach(System.out::println);

            System.out.println(context.getBean(BusinessSevice.class).getDataService());
        }
    }
}
