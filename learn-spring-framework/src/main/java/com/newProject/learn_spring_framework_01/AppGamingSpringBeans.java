package com.newProject.learn_spring_framework_01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.newProject.learn_spring_framework_01.Game.GameRunner;
import com.newProject.learn_spring_framework_01.Game.GamingConsole;

public class AppGamingSpringBeans {
    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
        
    }

}
