package com.example.ManyToMany.service;

import com.example.ManyToMany.entity.Course;
import com.example.ManyToMany.repository.CourseRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@Transactional
public class CourseService {

    @Autowired
    private CourseRepo courseRepo;

    public void saveCourse(Course course) {
        courseRepo.save(course);
    }


    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public Course getCourseById(int courseId) {
        return courseRepo.findById(courseId).orElse(null);
    }

    public void updateCourse(int id, Course updatedCourse) {
        Course existingCourse = getCourseById(id);
        if (existingCourse != null) {

            existingCourse.setCourseName(updatedCourse.getCourseName());

            courseRepo.save(existingCourse);
        }
    }
    public void deleteCourse(int courseId) {
        courseRepo.deleteById(courseId);
    }
}


/*@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(int id) {
        return courseRepository.findById(id).orElse(null);
    }

    public void saveCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(int id, Course updatedCourse) {
        Course existingCourse = getCourseById(id);
        if (existingCourse != null) {
            // Update fields of existingCourse with values from updatedCourse
            existingCourse.setCourseName(updatedCourse.getCourseName());
            // Update any other fields as needed

            courseRepository.save(existingCourse);
        }
    }

    public void deleteCourseById(int id) {
        courseRepository.deleteById(id);
    }
}
*/