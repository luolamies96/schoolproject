package com.school.app.schoolproject.data;

import java.util.ArrayList;
import java.util.List;

public class course {
    private long id;
    private String Coursename;
    private String Courseteacher;
    private String Classroom;
    private static long idcounter = 0;
    private List<student> studentids = new ArrayList<>();
    
    public course() {
       this("");
    }
    public course (String name) {
        this.id = idcounter++;
    }

    public course(String Coursename, String Courseteacher, String Classroom) {
        this.Coursename = Coursename;
        this.Courseteacher = Courseteacher;
        this.Classroom = Classroom;
        this.id = idcounter++;
        
    }
    public void addtocourse(student student) {
        studentids.add(student);
    }
    public void delfromcourse(student student) {
        studentids.remove(student);
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCoursename() {
        return this.Coursename;
    }

    public void setCoursename(String Coursename) {
        this.Coursename = Coursename;
    }

    public String getCourseteacher() {
        return this.Courseteacher;
    }

    public void setCourseteacher(String Courseteacher) {
        this.Courseteacher = Courseteacher;
    }

    public String getClassroom() {
        return this.Classroom;
    }

    public void setClassroom(String Classroom) {
        this.Classroom = Classroom;
    }

    public List<student> getStudentids() {
        return this.studentids;
    }

    public void setStudentids(List<student> studentids) {
        this.studentids = studentids;
    }

    
}
