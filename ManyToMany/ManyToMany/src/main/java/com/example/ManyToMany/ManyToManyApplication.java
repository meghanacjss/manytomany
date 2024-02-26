package com.example.ManyToMany;

import com.example.ManyToMany.entity.Course;
import com.example.ManyToMany.entity.Student;
import com.example.ManyToMany.repository.CourseRepo;
import com.example.ManyToMany.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication

public class ManyToManyApplication{
//public class ManyToManyApplication implements CommandLineRunner {
//	@Autowired
//	private CourseRepo courseRepo;
//	@Autowired
//	private StudentRepo studentRepo;

	public static void main(String[] args) {
		SpringApplication.run(ManyToManyApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		Student student1 = new Student();
//		student1.setStudentId(1);
//		student1.setStudentName("meghana");
//
//		Student student2 = new Student();
//		student2.setStudentId(2);
//		student2.setStudentName("manu");
//
//		Student student3 = new Student();
//		student3.setStudentId(3);
//		student3.setStudentName("sanvi");
//
//		Course course1 = new Course();
//		course1.setCourseId(5);
//		course1.setCourseName("JAVA");
//
//		Course course2 = new Course();
//		course2.setCourseId(6);
//		course2.setCourseName("SPRINGBOOT");
//
//		Course course3 = new Course();
//		course3.setCourseId(7);
//		course3.setCourseName("HIBERNATE");
//
//		Set<Student> course1Students = course1.getStudents();
//		course1Students.add(student1);
//		course1Students.add(student2);
//		course1Students.add(student3);
//
//		Set<Student> course2Students = course2.getStudents();
//		course2Students.add(student1);
//		course2Students.add(student2);
//		course2Students.add(student3);
//
//		Set<Student> course3Students = course3.getStudents();
//		course3Students.add(student1);
//		course3Students.add(student2);
//		course3Students.add(student3);
//
//		courseRepo.save(course1);
//		courseRepo.save(course2);
//		courseRepo.save(course3);
//
//		Course c1 = courseRepo.findById(5).get();
//		System.out.println(c1.getStudents().size());
//
//		Course c2 = courseRepo.findById(6).get();
//		System.out.println(c2.getStudents().size());
//
//		Course c3 = courseRepo.findById(7).get();
//		System.out.println(c3.getStudents().size());
//
//		Student s1 = studentRepo.findById(1).get();
//		System.out.println(s1.getCourses().size());
//
//		Student s2 = studentRepo.findById(2).get();
//		System.out.println(s2.getCourses().size());
//
//		Student s3 = studentRepo.findById(3).get();
//		System.out.println(s3.getCourses().size());
//
//		Course courseToUpdate = courseRepo.findById(5).orElse(null);
//		if (courseToUpdate != null) {
//			courseToUpdate.setCourseName("python");
//			courseRepo.updateCourseById(courseToUpdate.getCourseId(), courseToUpdate.getCourseName());
//			courseRepo.save(courseToUpdate);
//
//		}
//
//		Student studentToUpdate = studentRepo.findById(1).orElse(null);
//		if (studentToUpdate != null) {
//			studentToUpdate.setStudentName("maha");
//			studentRepo.updateStudentById(studentToUpdate.getStudentId(),studentToUpdate.getStudentName());
//			studentRepo.save(studentToUpdate);
//		}
//
//		courseRepo.deleteCourseById(7);
//		studentRepo.deleteStudentById(2);
//
//	}

}
