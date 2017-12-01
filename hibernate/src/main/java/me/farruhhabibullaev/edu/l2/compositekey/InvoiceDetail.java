package me.farruhhabibullaev.edu.l2.compositekey;

import javax.persistence.*;

@Entity
@Access(AccessType.FIELD)
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

    public long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(long invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
