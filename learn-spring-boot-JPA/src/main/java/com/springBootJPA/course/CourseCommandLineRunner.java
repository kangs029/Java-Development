package com.springBootJPA.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//import com.springBootJPA.course.jdbc.CourseJdbcRepository;
//import com.springBootJPA.course.jpa.CourseJpaRepository;
import com.springBootJPA.course.springdatajpa.SpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{
    // @Autowired
    // private CourseJdbcRepository repository;

    // @Autowired
    // private CourseJpaRepository repository;

    @Autowired
    private SpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Executing insert query...");
        //repository.insert(new Course(1,"Learn AWS","bob"));

        repository.save(new Course(1,"Learn AWS 1","bob"));
        repository.save(new Course(2,"Learn AWS 2","bob"));
        repository.save(new Course(3,"Learn AWS 3","bob"));

        repository.deleteById(1l);

        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
    }

}
