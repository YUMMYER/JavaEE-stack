package me.farruhhabibullaev.edu.l2.compositekey;

import javax.persistence.Id;
import javax.persistence.IdClass;

@IdClass(InvoiceId.class)
public class InvoiceDetail {

    @Id
    private long invoiceNo;

    @Id
    private String line;

    private int productId;

    private double price;


    public InvoiceDetail(){

    }
    
}
