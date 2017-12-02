package me.farruhhabibullaev.edu.l3.o1.f;

import javax.persistence.*;

@Entity
@Table(name = "_employee")
public class Employee {

    @Id
    @GeneratedValue
    private int employeeid;
    @Column(name = "_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "_office_id")
    private Office office;
    @ManyToOne
    @JoinColumn(name = "_department_id")
    private Department department;
    public Employee(){

    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Office getOffice() {
        return office;
    }

    public void setOffice(Office office) {
        this.office = office;
    }
}
