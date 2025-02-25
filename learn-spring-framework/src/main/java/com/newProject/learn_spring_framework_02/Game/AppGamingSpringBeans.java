package com.newProject.learn_spring_framework_02.Game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.newProject.learn_spring_framework_02.Game")
public class AppGamingSpringBeans {
    // @Bean
    // public GamingConsole game(){
    //     var game= new PacManGame();
    //     return game;
    // }


    //Removing since we want spring to create instance by adding @component annotation at PacMan Class.
    //also add @componentScan

     
    // @Bean
    // public GameRunner gameRunner(GamingConsole game){
    //     var gameRunner= new GameRunner(game);
    //     return gameRunner;
    // }
    public static void main(String[] args) {
        try(var context= new AnnotationConfigApplicationContext(AppGamingSpringBeans.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
        
    }

}
