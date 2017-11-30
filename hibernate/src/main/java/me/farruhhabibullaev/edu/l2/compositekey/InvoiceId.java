package me.farruhhabibullaev.edu.l2.compositekey;

import java.io.Serializable;

public class InvoiceId implements Serializable {

    public static final long serialVerionUID = 1L;

    private long invoiceNo;
    private String line;

    public static long getSerialVerionUID() {
        return serialVerionUID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InvoiceId)) return false;

        InvoiceId invoiceId = (InvoiceId) o;

        if (invoiceNo != invoiceId.invoiceNo) return false;
        return line != null ? line.equals(invoiceId.line) : invoiceId.line == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (invoiceNo ^ (invoiceNo >>> 32));
        result = 31 * result + (line != null ? line.hashCode() : 0);
        return result;
    }
}
