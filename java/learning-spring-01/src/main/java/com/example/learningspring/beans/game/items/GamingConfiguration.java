package com.example.learningspring.beans.game.items;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GameConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GameConsole game) {
        return new GameRunner(game);
    }
}
