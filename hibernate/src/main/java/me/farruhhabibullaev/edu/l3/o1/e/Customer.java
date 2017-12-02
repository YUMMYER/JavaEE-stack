package me.farruhhabibullaev.edu.l3.o1.e;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "_customer")
public class Customer {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "_name")
    private String name;

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

}
