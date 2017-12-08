package gui.domain;

import java.math.BigDecimal;

public class Employee {

    private int id;
    private String lastName;
    private String firstName;
    private String email;
    private String department;
    private BigDecimal salary;

    public Employee(int id,  String firstName,String lastName, String email,String department, BigDecimal salary) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
