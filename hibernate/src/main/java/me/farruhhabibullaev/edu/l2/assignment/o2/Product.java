package me.farruhhabibullaev.edu.l2.assignment.o2;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Product {

    @Column( name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
