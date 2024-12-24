package com.example.rest_demo.service;

import com.example.rest_demo.model.Course;
import com.example.rest_demo.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;
    @Override
    public String upsert(Course course) {
        courseRepository.save(course); // it will do both insert /update
        return "success";
    }

    @Override
    public Course getById(int id) {
        Optional<Course> findById= courseRepository.findById(id);
        //findById returns the optional object to avoid the null pointer exception

        if(findById.isPresent()){
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public String deleteById(int id) {
        if(courseRepository.existsById(id)){
            courseRepository.deleteById(id);
            return "Delete Success";
        }else{
            return "no records found";
        }
    }
}
