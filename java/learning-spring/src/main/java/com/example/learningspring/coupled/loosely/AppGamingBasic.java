package com.example.learningspring.coupled.loosely;

import com.example.learningspring.coupled.loosely.game.GameRunner;
import com.example.learningspring.coupled.loosely.game.PacmanGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        /**
         * GameConsole이라는 Interface를 활용해서 MarioGame, PacmanGame, SuperContraGame이라는 3가지 클래스를 묶음.
         * 따라서 GameRunner에서는 GameConsole Interface를 구현한 class를 모두 받아들일 수 있게 됌.
         */
        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
