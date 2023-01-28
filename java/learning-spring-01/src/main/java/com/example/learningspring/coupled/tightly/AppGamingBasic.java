package com.example.learningspring.coupled.tightly;

import com.example.learningspring.coupled.tightly.game.GameRunner;
import com.example.learningspring.coupled.tightly.game.MarioGame;

public class AppGamingBasic {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);

        /**
         * The constructor GameRunner(SuperContraGame) is undefined.
         * GameRunner class가 MarioGame 타입만 받을 수 있다.
         */
//        var superContraGame = new SuperContraGame();
//        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
