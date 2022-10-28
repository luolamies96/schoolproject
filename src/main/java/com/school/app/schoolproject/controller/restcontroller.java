package com.school.app.schoolproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.app.schoolproject.data.course;
import com.school.app.schoolproject.data.student;
import com.school.app.schoolproject.service.courseservice;

@RestController
public class restcontroller {

@Autowired
courseservice pCourse;
@Autowired 
courseservice pStudent;

@GetMapping("courses")
public List<course> getcourses(){
    return pCourse.getAllcourses();
}
@PostMapping("addcourse")
public course addcourse(@RequestBody course course){
    pCourse.addCourse(course);
    return course;
    // http://localhost:8080/addcourse
}

@GetMapping("students")
 public List<student> getStudents(){
    return pStudent.GetAllStudents();
 }

@PostMapping("addstudent")
public student addStudent(@RequestBody student student){
pStudent.addStudent(student);
return student;
}
@GetMapping("addtocourse")
public String addtocourse(
    @RequestParam Integer studentid, Integer courseid,
    @RequestBody(required = false) student student) {
        pCourse.addStudentToCourse(studentid, courseid);
        return "success";
        // http://localhost:8080/addtocourse?studentid=?&courseid=?
    }
@GetMapping("delfromcourse")
public String delfromcourse(
    @RequestParam Integer studentid , Integer courseid,
    @RequestBody(required = false) student student) {
        pCourse.delStudentToCourse(studentid, courseid);
        return "success";
        // http://localhost:8080/delfromcourse?studentid=?&courseid=?
    }




    
}
