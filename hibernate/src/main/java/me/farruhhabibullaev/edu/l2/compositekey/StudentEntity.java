package me.farruhhabibullaev.edu.l2.compositekey;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "studententity")
public class StudentEntity {

    @Column(name = "studentname")
    private String studentName;

    @EmbeddedId
    private RegistrationId registrationId;

    public StudentEntity(){

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public RegistrationId getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(RegistrationId registrationId) {
        this.registrationId = registrationId;
    }
}
