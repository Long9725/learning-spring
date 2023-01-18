package com.examplekotlin.learningspring.coupled.loosely.game

class PacmanGame : GameConsole {
    override fun up() {
        println("up")
    }

    override fun down() {
        println("down")
    }

    override fun left() {
        println("left")
    }

    override fun right() {
        println("right")
    }
}