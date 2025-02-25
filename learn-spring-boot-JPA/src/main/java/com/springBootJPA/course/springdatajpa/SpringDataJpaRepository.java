package com.springBootJPA.course.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootJPA.course.Course;

public interface SpringDataJpaRepository extends JpaRepository<Course,Long>{

}
