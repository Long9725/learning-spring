package com.example.learningspring.coupled.loosely.game;

public class GameRunner {
    private final GameConsole game;

    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
    }
}
