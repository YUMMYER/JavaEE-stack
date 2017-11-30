package me.farruhhabibullaev.edu.javatpoint.inheritence.perhierarchy;

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
