package me.farruhhabibullaev.edu.l3.lecture.onetomanyjointableuni;

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

//        Person person = new Person();
//        person.setFirstName("Farruh");
//        person.setLastName("Habibullaev");
//
//        PersonAddress personAddress = new PersonAddress();
//        personAddress.setCity("Fairfield");
//        personAddress.setState("Iowa");
//        personAddress.setZip("52557");
//        personAddress.setStreet("1000N 4ST");
//        person.setPersonAddress(personAddress);

        Transaction t = session.beginTransaction();
        //session.saveOrUpdate(person);

        t.commit();
        session.close();
        System.out.println("Success");

    }
}