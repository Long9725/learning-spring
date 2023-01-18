package com.examplekotlin.learningspring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LearningSpringApplication

fun main(args: Array<String>) {
	runApplication<LearningSpringApplication>(*args)
}
