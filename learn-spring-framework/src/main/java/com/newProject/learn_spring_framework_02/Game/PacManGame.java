package com.newProject.learn_spring_framework_02.Game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{
    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("go in to hole");
    }
    public void left(){
        System.out.println("go back");
    }
    public void right(){
        System.out.println("accelerate");
    }
}
