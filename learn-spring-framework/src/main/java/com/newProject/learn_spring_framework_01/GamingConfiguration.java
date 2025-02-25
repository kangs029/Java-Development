package com.newProject.learn_spring_framework_01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.newProject.learn_spring_framework_01.Game.GameRunner;
import com.newProject.learn_spring_framework_01.Game.GamingConsole;
import com.newProject.learn_spring_framework_01.Game.PacManGame;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        var game= new PacManGame();
        return game;
    }

    //one way
    // @Bean
    // public GameRunner gameRunner(){
    //     var gameRunner= new GameRunner(game());
    //     return gameRunner;
    // }

    //another way
    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner= new GameRunner(game);
        return gameRunner;
    }

}
