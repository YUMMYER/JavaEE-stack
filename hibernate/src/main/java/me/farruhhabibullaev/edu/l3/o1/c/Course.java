package me.farruhhabibullaev.edu.l3.o1.c;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "_course")
public class Course {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "_course_number")
    private String courseNumber;
    @Column(name = "name")
    private String name;
    @ManyToMany(mappedBy = "courseList")
    private List<Student> studentList = new ArrayList<>();

    public Course(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
