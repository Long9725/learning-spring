package com.examplekotlin.learningspring.coupled.tightly.game

class GameRunner constructor(private var game: MarioGame) {
    fun run() {
        println("Running game: $game")
    }
}