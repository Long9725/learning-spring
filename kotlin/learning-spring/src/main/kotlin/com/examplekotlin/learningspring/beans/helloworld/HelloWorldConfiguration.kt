package com.examplekotlin.learningspring.beans.helloworld

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

data class Person(val name: String, val age: Int, val address: Address)
data class Address(val firstLine: String, val city: String)

@Configuration
class HelloWorldConfiguration {
    @Bean
    fun name(): String {
        return "Ranga";
    }

    @Bean
    fun age(): Int {
        return 15
    }

    @Bean
    fun person(): Person {
        return Person("Ravi", 20, Address("Baker Street", "London"))
    }

    @Bean
    fun person2MethodCall(): Person {
        return Person(name(), age(), address())
    }

    @Bean
    fun person3Parameters(name: String, age: Int, address3: Address): Person {
        return Person(name, age, address3)
    }

    @Bean("address2")
    fun address(): Address {
        return Address("Baker Street", "London")
    }

    // 자바에서는 String[]를 String처럼 써도 알아서 처리된다.
    // 코틀린에서는 Array라는 명시적 타입이 있어서 안되는 것 같다.
    @Bean(name = ["address3"])
    fun address3(): Address {
        return Address("Motinagar", "Hyderabad")
    }
}