package com.example.ManyToMany.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="student")
public class Student {
  @Id
  private int studentId;
  private String studentName;

    @ManyToMany(mappedBy = "studentslist",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Course> courseslist = new HashSet<>();

  public Student() {
  }

  public Student(int studentId, String studentName, Set<Course> courses) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.courseslist = courses;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public Set<Course> getCourses() {
    return courseslist;
  }

  public void setCourses(Set<Course> courses) {
    this.courseslist = courses;
  }
}
