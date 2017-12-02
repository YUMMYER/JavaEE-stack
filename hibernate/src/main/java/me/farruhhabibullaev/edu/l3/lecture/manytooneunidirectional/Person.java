package me.farruhhabibullaev.edu.l3.lecture.manytooneunidirectional;

import javax.persistence.*;

@Entity
@Table(name = "_person")
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "_address_id")
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
