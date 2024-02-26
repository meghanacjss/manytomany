package com.example.ManyToMany.service;

import com.example.ManyToMany.entity.Student;
import com.example.ManyToMany.repository.StudentRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class StudentService {


    @Autowired
    private StudentRepo studentRepo;



    public void saveStudent(Student student) {

        studentRepo.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public Student getStudentById(int studentId) {
        return studentRepo.findById(studentId).orElse(null);
    }

public Student updateStudentById(int studentId){
        return studentRepo.getReferenceById(studentId);
}

    public void deleteStudent(int  studentId) {
        studentRepo.deleteById(studentId);
    }
}
