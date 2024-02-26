package com.example.ManyToMany.model;

import com.example.ManyToMany.entity.Course;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CourseModel {
    private int courseId;
    private String courseName;
    private Set<Course> courses = new HashSet<>();

}
