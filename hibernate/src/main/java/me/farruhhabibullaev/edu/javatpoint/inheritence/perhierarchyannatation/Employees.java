package me.farruhhabibullaev.edu.javatpoint.inheritence.perhierarchyannatation;

import javax.persistence.*;

@Entity
@Table(name = "employeetable")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type",  discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "employee")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
