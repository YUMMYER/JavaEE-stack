package me.farruhhabibullaev.edu.javatpoint.inheritence.persubclassxml;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


public class RegularEmployee extends Employees {

    private float salary;
    private int bonus;

    public RegularEmployee(){

    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
