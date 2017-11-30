package me.farruhhabibullaev.edu.javatpoint.inheritence.persubclassxml;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

public class ContractEmployee extends Employees {

    private float payPerHour;
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
