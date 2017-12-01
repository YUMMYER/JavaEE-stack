package me.farruhhabibullaev.edu.l2.compositekey;

import me.farruhhabibullaev.edu.javatpoint.inheritence.perconcreteclassannatation.ContractEmployee;
import me.farruhhabibullaev.edu.javatpoint.inheritence.perconcreteclassannatation.Employees;
import me.farruhhabibullaev.edu.javatpoint.inheritence.perconcreteclassannatation.RegularEmployee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class StoreData {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        Session session = cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();

        Transaction t = session.beginTransaction();

        List<Address> ads = new ArrayList<>();
        Address address = new Address();
        address.setState("New York");
        address.setZip("553434");

        Address address1 = new Address();
        address1.setZip("45345");
        address1.setState("York Bem");

        ads.add(address);
        ads.add(address1);

        Student student = new Student();
        student.setAddress(ads);
        student.setId(12);
        session.save(student);
        t.commit();
        session.close();
        System.out.println("success");
    }
}
