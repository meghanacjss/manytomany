package com.example.ManyToMany.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="course")
public class Course {
@Id
    private int courseId;
    private String courseName;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)

    private Set<Student> studentslist = new HashSet<>();

    public Course() {
    }

    public Course(int courseId, String courseName, Set<Student> students) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.studentslist = students;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Set<Student> getStudents() {
        return studentslist;
    }

    public void setStudents(Set<Student> students) {
        this.studentslist = students;
    }
}
