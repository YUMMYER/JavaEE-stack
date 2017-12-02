package me.farruhhabibullaev.edu.l3.lecture.onetomanyjointableuni;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "_student")
public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;

    @OneToMany
    @JoinColumn(name = "_student_id")
    private List<StudentAddress> studentAddress =  new ArrayList<>();

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<StudentAddress> getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(List<StudentAddress> StudentAddress) {
        this.studentAddress = StudentAddress;
    }
}
