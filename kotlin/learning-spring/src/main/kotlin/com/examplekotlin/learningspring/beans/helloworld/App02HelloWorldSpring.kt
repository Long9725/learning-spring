package com.examplekotlin.learningspring.beans.helloworld

import org.springframework.context.annotation.AnnotationConfigApplicationContext


fun main(args: Array<String>) {

    // 왜 java class를 넣어줘야 하지?
    // Kotlin에서 class는 KClass를 Return
    // class.java는 Class를 Return.
    // Type이 다르기 때문에 class만 넣으면 type error
    AnnotationConfigApplicationContext(HelloWorldConfiguration::class.java).use { context ->
        println(context.getBean("name"));
        println(context.getBean("age"))
        println(context.getBean("person"))
        println(context.getBean("person2MethodCall"))
        println(context.getBean("person3Parameters"))
        println(context.getBean("address2"))
    }


}