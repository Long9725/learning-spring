package com.examplekotlin.learningspring.coupled.loosely.game

class MarioGame : GameConsole {
    override fun up() {
        println("up")
    }

    override fun down() {
        println("Sit down")
    }

    override fun left() {
        println("Go back")
    }

    override fun right() {
        println("Shoot a bullet")
    }
}