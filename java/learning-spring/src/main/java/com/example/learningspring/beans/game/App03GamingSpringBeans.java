package com.example.learningspring.beans.game;

import com.example.learningspring.beans.game.items.GameConsole;
import com.example.learningspring.beans.game.items.GameRunner;
import com.example.learningspring.beans.game.items.GamingConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GameConsole.class).up();
            context.getBean(GameRunner.class).run();
        }
    }
}
