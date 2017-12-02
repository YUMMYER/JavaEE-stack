package me.farruhhabibullaev.edu.l3.o1.e;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();



        Transaction t = session.beginTransaction();

        t.commit();
        session.close();
        System.out.println("Success");

    }
}