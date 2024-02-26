package com.example.ManyToMany.model;

import com.example.ManyToMany.entity.Student;

import java.util.HashSet;
import java.util.Set;

public class StudentModel {
    private int studentId;
    private String student_name;

    private Set<Student> students = new HashSet<>();
}
