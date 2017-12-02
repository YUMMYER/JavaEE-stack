package me.farruhhabibullaev.edu.l3.o1.f;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "_department")
public class Department {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "department")
    private List<Employee> employeeList;

    public Department(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
