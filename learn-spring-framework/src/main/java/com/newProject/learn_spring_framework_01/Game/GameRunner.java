package com.newProject.learn_spring_framework_01.Game;

public class GameRunner {
   // MarioGame game;//it is tightly coupeled with mariogame
    // public GameRunner(MarioGame game){
    //     this.game=game;
    // }

    GamingConsole game;
    public GameRunner(GamingConsole game){
        this.game=game;
    }

    public void run(){
        System.out.println("Running game: "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
