package me.farruhhabibullaev.edu.l2.compositekey;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RegistrationId implements Serializable {


    public static final long serialVersionUID = 1L;

    @Column(name = "studentid")
    private String studentId;

    @Column(name = "departmentid")
    private String departmentId;


    public RegistrationId(){

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegistrationId)) return false;

        RegistrationId that = (RegistrationId) o;

        if (studentId != null ? !studentId.equals(that.studentId) : that.studentId != null) return false;
        return departmentId != null ? departmentId.equals(that.departmentId) : that.departmentId == null;
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (departmentId != null ? departmentId.hashCode() : 0);
        return result;
    }
}
