package com.example.rest_demo.controller;

import com.example.rest_demo.model.Course;
import com.example.rest_demo.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseRestController {
    @Autowired
    private CourseService courseService;

    @PostMapping("/course")
    public ResponseEntity<String> createCourse(@RequestBody Course course){
        String status = courseService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping("/course/{id}")
    public ResponseEntity<Course> getCourse(@PathVariable int id){
        Course course = courseService.getById(id);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> getAllCourse(){
        List<Course> course = courseService.getAllCourses();
        return new ResponseEntity<>(course, HttpStatus.OK);
    }


    @PutMapping("/course")
    public ResponseEntity<String> updateCourse(Course course){
        String status = courseService.upsert(course);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }

    @DeleteMapping("/course/{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable int id){
        String status= courseService.deleteById(id);
        return new ResponseEntity<>(status, HttpStatus.OK);
    }
}
