package com.newProject.learn_spring_framework_01;

import com.newProject.learn_spring_framework_01.Game.GameRunner;
import com.newProject.learn_spring_framework_01.Game.MarioGame;
import com.newProject.learn_spring_framework_01.Game.PacManGame;
import com.newProject.learn_spring_framework_01.Game.SuperContraGame;

public class App01GamingBasic {
    public static void main(String[] args) {
        var game1=new MarioGame();
        var gameRunner=new GameRunner(game1);
        gameRunner.run();

        var game2=new SuperContraGame();
        gameRunner=new GameRunner(game2);
        gameRunner.run();

        var game3=new PacManGame();
        gameRunner=new GameRunner(game3);
        gameRunner.run();
    }
}
