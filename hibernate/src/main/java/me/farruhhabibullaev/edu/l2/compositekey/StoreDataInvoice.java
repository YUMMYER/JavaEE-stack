package me.farruhhabibullaev.edu.l2.compositekey;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreDataInvoice {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        Session session = cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();

        Transaction t = session.beginTransaction();

       InvoiceId invoiceId = new InvoiceId();
       invoiceId.setInvoiceNo(12L);
       invoiceId.setLine("First");

       InvoiceDetail invoiceDetail  = new InvoiceDetail();
       invoiceDetail.setInvoiceNo(12l);
       invoiceDetail.setLine("frist");
       invoiceDetail.setPrice(234.0);
       invoiceDetail.setProductId(23);

        session.persist(invoiceDetail);
        t.commit();
        session.close();
        System.out.println("success");
    }
}
