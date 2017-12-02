package me.farruhhabibullaev.edu.l2.domain;

import me.farruhhabibullaev.edu.javatpoint.inheritence.perconcreteclassannatation.ContractEmployee;
import me.farruhhabibullaev.edu.javatpoint.inheritence.perconcreteclassannatation.Employees;
import me.farruhhabibullaev.edu.javatpoint.inheritence.perconcreteclassannatation.RegularEmployee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        Session session = cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();

        Transaction t = session.beginTransaction();

//        PersonAddress address = new PersonAddress();
//        address.setCity("Namangan");
//        address.setStreet("Oybek");
//        address.setState("Uzbekistan");
//        address.setZip("52557");
//
//        Driver driver = new Driver();
//        driver.setName("Farruh");
//        driver.setPersonAddress(address);
//        session.persist(driver);

        t.commit();
        session.close();
        System.out.println("success");
    }
}
