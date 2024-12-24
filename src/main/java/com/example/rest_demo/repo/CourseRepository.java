package com.example.rest_demo.repo;

import com.example.rest_demo.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable> {
}
