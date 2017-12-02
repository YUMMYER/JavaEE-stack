package me.farruhhabibullaev.edu.l3.o1.a;

import javax.persistence.*;

@Entity
@Table(name = "_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeNumber;
    @Column(name = "_name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "_department_id")
    private Department department;

    public Employee(){

    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
