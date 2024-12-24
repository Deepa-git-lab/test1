package com.example.rest_demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "course_dtls")
public class Course {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String name;
    private Double price;
}
