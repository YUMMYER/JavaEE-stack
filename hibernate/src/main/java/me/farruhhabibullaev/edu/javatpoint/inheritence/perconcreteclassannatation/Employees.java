package me.farruhhabibullaev.edu.javatpoint.inheritence.perconcreteclassannatation;

import javax.persistence.*;

@Entity
@Table(name = "empconc")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;

    public Employees(){

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
}
