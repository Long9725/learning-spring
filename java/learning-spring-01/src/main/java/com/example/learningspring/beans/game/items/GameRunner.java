package com.example.learningspring.beans.game.items;

public class GameRunner {
    private final GameConsole game;

    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
