package com.newProject.learn_spring_framework_02.Game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole{

    public void up(){
        System.out.println("fly");
    }
    public void down(){
        System.out.println("fall");
    }
    public void left(){
        System.out.println("go west");
    }
    public void right(){
        System.out.println("go east");
    }

}
