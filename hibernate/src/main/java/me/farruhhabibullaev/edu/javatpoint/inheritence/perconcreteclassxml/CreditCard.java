package me.farruhhabibullaev.edu.javatpoint.inheritence.perconcreteclassxml;

public class CreditCard extends Payment {

    private String creditCardType;

    public CreditCard(){

    }

    public String getCreditCardType() {
        return creditCardType;
    }

    public void setCreditCardType(String creditCardType) {
        this.creditCardType = creditCardType;
    }
}
