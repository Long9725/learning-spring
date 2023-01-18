package com.examplekotlin.learningspring.coupled.loosely.game

class GameRunner constructor(private var game: GameConsole) {
    fun run() {
        println("Running game: $game")
        game.up()
        game.down()
        game.left()
        game.right()
    }
}