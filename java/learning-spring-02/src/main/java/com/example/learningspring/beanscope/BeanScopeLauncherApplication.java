package com.example.learningspring.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass {

}

@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {

}

@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
class SingletonClass {

}

@Scope(value = ConfigurableBeanFactory.FACTORY_BEAN_PREFIX)
@Component
class FactoryBeanPrefixClass {

}

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));
            System.out.println(context.getBean(NormalClass.class));

            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));
            System.out.println(context.getBean(PrototypeClass.class));

            System.out.println(context.getBean(SingletonClass.class));
            System.out.println(context.getBean(SingletonClass.class));
            System.out.println(context.getBean(SingletonClass.class));

            System.out.println(context.getBean(FactoryBeanPrefixClass.class));
            System.out.println(context.getBean(FactoryBeanPrefixClass.class));
            System.out.println(context.getBean(FactoryBeanPrefixClass.class));
        }
    }
}
