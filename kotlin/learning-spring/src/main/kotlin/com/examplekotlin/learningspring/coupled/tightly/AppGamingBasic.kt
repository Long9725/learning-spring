package com.examplekotlin.learningspring.coupled.tightly

import com.examplekotlin.learningspring.coupled.loosely.game.GameRunner
import com.examplekotlin.learningspring.coupled.loosely.game.MarioGame

fun main(args: Array<String>) {
    val game =  MarioGame();
    val gameRunner =  GameRunner(game);
    gameRunner.run();
}