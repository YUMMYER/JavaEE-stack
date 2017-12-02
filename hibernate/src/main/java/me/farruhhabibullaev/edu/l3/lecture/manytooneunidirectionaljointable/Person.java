package me.farruhhabibullaev.edu.l3.lecture.manytooneunidirectionaljointable;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "_person")
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "_person_address_trans",
            joinColumns = @JoinColumn(name = "_person_id"),
            inverseJoinColumns = @JoinColumn(name = "_address_id"))
    private PersonAddress personAddress;

    public Person(){

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

    public PersonAddress getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(PersonAddress personAddress) {
        this.personAddress = personAddress;
    }
}
