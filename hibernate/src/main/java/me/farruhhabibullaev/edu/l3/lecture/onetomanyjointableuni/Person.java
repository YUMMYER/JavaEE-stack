package me.farruhhabibullaev.edu.l3.lecture.onetomanyjointableuni;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;

    @OneToMany
    @JoinTable( name = "_person_address",
            joinColumns =@JoinColumn(name = "_person_id"),
            inverseJoinColumns = @JoinColumn(name = "_address_id"))
    private List<PersonAddress> personAddress;

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

    public List<PersonAddress> getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(List<PersonAddress> personAddress) {
        this.personAddress = personAddress;
    }
}
