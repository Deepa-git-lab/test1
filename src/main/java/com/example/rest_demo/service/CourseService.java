package com.example.rest_demo.service;

import com.example.rest_demo.model.Course;

import java.util.List;

public interface CourseService {
    public String upsert(Course course);
    public  Course getById(int id);

    public List<Course> getAllCourses();

    public String deleteById(int id);
}
