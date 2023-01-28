package com.example.learningspring.beans.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Spring Context 가져오기 -
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // 2. Spring이 관리하길 원하는 걸 정하기 - @Configuration
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
            System.out.println(context.getBean("person5Qualifier"));
            System.out.println(context.getBean("address2"));

            // error
            System.out.println(context.getBean(Person.class));
            // address2와 address3 중 어떤 걸 선택해야하는 지를 몰라 에러가 발생한다.
            // System.out.println(context.getBean(Address.class));

            // System.out.println은 안되는 이유?
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}

