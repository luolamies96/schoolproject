package com.school.app.schoolproject.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.school.app.schoolproject.data.course;
import com.school.app.schoolproject.data.student;

@Service
public class courseservice {
    private List<course> courses = new ArrayList<>();
    private List<student> students = new ArrayList<>();

    public void addCourse(course course) {
        courses.add(course);
    }

    public List<course> getAllcourses() {
        return courses;
    }

    public course GetById(long id){
        for (course course : courses){
            if (course.getId() == id){
                return course;
            }
        }
        return null;
    }
    public void addStudent(student student) {
        students.add(student);
    }
    public List<student> GetAllStudents() {
        return students;
    }
    public student GetByIdstudent(long idnum){
        for (student student : students){
            if (student.getIdnum() == idnum) {
                return student;
            }
        }
        return null;
    }

    public boolean addStudentToCourse(int idnum, int id) {

        student student = GetByIdstudent(idnum);
        course course = GetById(id);

        if (student !=null && course != null) {
            course.addtocourse(student);
            return true;
        }
        return false;
    }
    public boolean delStudentToCourse(int idnum, int id) {

        student student = GetByIdstudent(idnum);
        course course = GetById(id);

        if (student !=null && course != null) {
            course.delfromcourse(student);
            return true;
        }
        return false;
    }
}
