package com.example.ManyToMany.controller;

import com.example.ManyToMany.entity.Course;
import com.example.ManyToMany.entity.Student;
import com.example.ManyToMany.service.CourseService;
import com.example.ManyToMany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CourseController {

        @Autowired
        private CourseService courseService;

        @Autowired
        private StudentService studentService;


    @RequestMapping("/save")
    public String saveCourseAndRedirect(Model model, @ModelAttribute("course") Course course) {
        System.out.println("save");
        courseService.saveCourse(course);
        return "courseForm";
    }

//        @RequestMapping("/save")
//        public String listCourses(Model model) {
//            System.out.println("save");
//            List<Course> courses = courseService.getAllCourses();
//            System.out.println(courses);
//            model.addAttribute("courses", courses);
//            return "courseForm";
//        }

        @GetMapping("/add")
        public String showAddForm(Model model) {
            model.addAttribute("course", new Course());
            return "course-add";
        }

        @PostMapping("/add")
        public String addCourse(@ModelAttribute("course") Course course) {
            courseService.saveCourse(course);
            return "courses-list";
        }

//        @GetMapping("/edit")
//        public String showEditForm(@RequestParam("id") int id, Model model) {
//            Course course = courseService.getCourseById(id);
//            model.addAttribute("course", course);
//            return "course/edit";
//        }

//        @PostMapping("/edit")
//        public String editCourse(@RequestParam("id") int id, @ModelAttribute("updatedcourse") Course course) {
//            courseService.updateCourse(id, course);
//            return "redirect:/courses/list";
//        }
//
//        @GetMapping("/delete")
//        public String deleteCourse(@RequestParam("id") int id) {
//            courseService.deleteCourse(id);
//            return "redirect:/courses/list";
//        }

        @GetMapping("/students/list")
        public String listStudents(Model model) {
            List<Student> students = studentService.getAllStudents();
            model.addAttribute("students", students);
            return "student-list";
        }

        @GetMapping("/students/add")
        public String showAddStudentForm(Model model) {
            model.addAttribute("student", new Student());
            return "student-add";
        }

        @PostMapping("/students/add")
        public String addStudent(@ModelAttribute("student") Student student) {
            studentService.saveStudent(student);
            return "redirect:/courses/students-list";
        }

//        @GetMapping("/students/edit/{id}")
//        public String showEditStudentForm(@PathVariable("id") int id, Model model) {
//            Student student = studentService.getStudentById(id);
//            model.addAttribute("student", student);
//            return "student/edit";
//        }
//
//        @PostMapping("/students/edit/{id}")
//        public String editStudent(@PathVariable("id") int id, @ModelAttribute("student") Student student) {
//            studentService.updateStudentById(id, student);
//            return "redirect:/courses/students/list";
//        }
//
//        @GetMapping("/students/delete")
//        public String deleteStudent(@RequestParam("id") int id) {
//            studentService.deleteStudent(id);
//            return "redirect:/courses/students/list";
//        }
    }




















































//    @Autowired
//    private CourseRepo courseRepo;
//    @RequestMapping("/welcome")
//    public String index(){
//    return "welcome";
//    }
//
//
//    @GetMapping("/form")
//    public String showFrom(Model model){
//     model.addAttribute("course",new Course());
//     return "course-form";
//    }
//    @RequestMapping("/")
//    public void saveCourse(Course course, Model model){



