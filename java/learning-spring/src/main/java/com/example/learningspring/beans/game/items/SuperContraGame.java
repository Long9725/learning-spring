package com.example.learningspring.beans.game.items;

public class SuperContraGame implements GameConsole {
    public void up() {
        System.out.println("Jump");
    }

    public void down() {
        System.out.println("Go into a hole");
    }

    public void left() {
        System.out.println("Go left");
    }

    public void right() {
        System.out.println("Accelerate");
    }
}
