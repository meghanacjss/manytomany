package com.example.ManyToMany.repository;

import com.example.ManyToMany.entity.Course;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
//    @Modifying
//    @Transactional
//    @Query("UPDATE Course c SET c.courseName = :courseName WHERE c.id = :courseId")
//
//    void updateCourseById(@Param("courseId") int courseId, @Param("courseName") String courseName);
//
//
//    @Modifying
//    @Transactional
//    @Query("DELETE FROM Course c WHERE c.id = :courseId")
//    void deleteCourseById(@Param("courseId") int courseId);

}
