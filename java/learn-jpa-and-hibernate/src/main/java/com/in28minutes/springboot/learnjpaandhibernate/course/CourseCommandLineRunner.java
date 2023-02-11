package com.in28minutes.springboot.learnjpaandhibernate.course;

import com.in28minutes.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;
    @Autowired
    private CourseJpaRepository courseJpaRepository;
    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseSpringDataJpaRepository.save(new Course(1, "Learn AWS", "in28minutes"));
        courseSpringDataJpaRepository.save(new Course(2, "Learn Azure", "in28minutes"));
        courseSpringDataJpaRepository.save(new Course(3, "Learn DevOps", "in28minutes"));

        courseSpringDataJpaRepository.deleteById(1L);
        System.out.println(courseSpringDataJpaRepository.findById(2L));
        courseSpringDataJpaRepository.findAll().forEach(System.out::println);
        courseSpringDataJpaRepository.findByName("Learn Azure").forEach(System.out::println);
        courseSpringDataJpaRepository.findByAuthor("in28minutes").forEach(System.out::println);
    }
}
