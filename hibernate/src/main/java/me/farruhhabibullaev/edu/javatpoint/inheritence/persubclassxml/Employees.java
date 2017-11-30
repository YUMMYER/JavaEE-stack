package me.farruhhabibullaev.edu.javatpoint.inheritence.persubclassxml;

import javax.persistence.*;

public class Employees {

    private int id;
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
