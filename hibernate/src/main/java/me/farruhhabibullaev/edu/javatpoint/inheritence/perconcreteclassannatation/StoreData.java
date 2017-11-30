package me.farruhhabibullaev.edu.javatpoint.inheritence.perconcreteclassannatation;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        Session session = cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();

        Transaction t = session.beginTransaction();

        Employees e1 = new Employees();
        e1.setName("sonoo");

        RegularEmployee e2 = new RegularEmployee();
        e2.setName("Vivek Kumar");
        e2.setSalary(50000);
        e2.setBonus(5);

        ContractEmployee e3 = new ContractEmployee();
        e3.setName("Arjun Kumar");
        e3.setPayPerHour(1000);
        e3.setContractDuration("15 hours");

        session.persist(e1);
        session.persist(e2);
        session.persist(e3);

        t.commit();
        session.close();
        System.out.println("success");
    }
}  