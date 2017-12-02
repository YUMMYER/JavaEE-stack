package me.farruhhabibullaev.edu.l3.o1.f;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "_office")
public class Office {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "_room_number")
    private String roomNumber;
    @Column(name = "_building")
    private String building;
    @OneToMany(mappedBy = "office")

    List<Employee> employeeList = new ArrayList<>();

    public Office(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
