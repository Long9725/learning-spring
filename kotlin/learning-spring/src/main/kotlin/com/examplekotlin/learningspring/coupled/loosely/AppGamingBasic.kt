package com.examplekotlin.learningspring.coupled.loosely

import com.examplekotlin.learningspring.coupled.loosely.game.GameRunner
import com.examplekotlin.learningspring.coupled.loosely.game.PacmanGame

fun main(args: Array<String>) {
    /**
     * GameConsole이라는 Interface를 활용해서 MarioGame, PacmanGame, SuperContraGame이라는 3가지 클래스를 묶음.
     * 따라서 GameRunner에서는 GameConsole Interface를 구현한 class를 모두 받아들일 수 있게 됌.
     */
    // val game = MarioGame();
    // val game = SuperContraGame();
    val game = PacmanGame()
    val gameRunner = GameRunner(game);
    gameRunner.run();
}