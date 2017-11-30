package me.farruhhabibullaev.edu.javatpoint.inheritence.perconcreteclassannatation;

import javax.persistence.*;

@Entity
@Table(name = "empconccontract")
@AttributeOverrides({
        @AttributeOverride(name="id", column=@Column(name="id")),
        @AttributeOverride(name="name", column=@Column(name="name"))
})
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
