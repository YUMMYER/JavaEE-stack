package me.farruhhabibullaev.edu.javatpoint.inheritence.perconcreteclassxml;

public class Check extends Payment {
    private String checkType;

    public Check(){

    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }
}
