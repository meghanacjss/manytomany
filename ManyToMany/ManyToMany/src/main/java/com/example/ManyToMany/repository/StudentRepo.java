package com.example.ManyToMany.repository;

import com.example.ManyToMany.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
//@Modifying
//@Transactional
//@Query("UPDATE Student s SET s.studentName = :studentName WHERE s.id = :studentId")
//void updateStudentById(@Param("studentId") int studentId, @Param("studentName") String studentName);
//
//
//    @Modifying
//    @Transactional
//    @Query("DELETE FROM Student s WHERE s.id = :studentId")
//    void deleteStudentById(@Param("studentId") int studentId);
}
