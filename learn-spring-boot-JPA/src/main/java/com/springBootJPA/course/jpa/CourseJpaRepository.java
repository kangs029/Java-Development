package com.springBootJPA.course.jpa;

import org.springframework.stereotype.Repository;

import com.springBootJPA.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
    //@Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(long Id){
        return entityManager.find(Course.class, Id);
    }

    public void deleteById(long Id){
        Course course= entityManager.find(Course.class, Id);
        entityManager.remove(course);
    }
}
