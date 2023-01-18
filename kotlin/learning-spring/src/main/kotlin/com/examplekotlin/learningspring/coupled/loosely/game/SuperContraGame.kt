package com.examplekotlin.learningspring.coupled.loosely.game

class SuperContraGame : GameConsole {
    override fun up() {
        println("Jump")
    }

    override fun down() {
        println("Go into a hole")
    }

    override fun left() {
        println("Go left")
    }

    override fun right() {
        println("Accelerate")
    }
}