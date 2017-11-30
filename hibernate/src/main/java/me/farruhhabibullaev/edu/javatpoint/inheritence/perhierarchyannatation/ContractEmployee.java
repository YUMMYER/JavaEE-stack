package me.farruhhabibullaev.edu.javatpoint.inheritence.perhierarchyannatation;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "contractemployee")
public class ContractEmployee extends Employees {

    @Column(name = "payPerHour")
    private float payPerHour;
    @Column(name = "contractDuration")
    private String contractDuration;

    public ContractEmployee(){

    }

    public float getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(float payPerHour) {
        this.payPerHour = payPerHour;
    }

    public String getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(String contractDuration) {
        this.contractDuration = contractDuration;
    }
}
