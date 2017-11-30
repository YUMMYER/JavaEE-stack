package me.farruhhabibullaev.edu.javatpoint.inheritence.perhierarchyannatation;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "regularemployee")
public class RegularEmployee extends Employees {

    @Column(name = "salary")
    private float salary;
    @Column(name = "bonus")
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
