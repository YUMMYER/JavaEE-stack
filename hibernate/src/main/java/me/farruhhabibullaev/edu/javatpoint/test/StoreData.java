package me.farruhhabibullaev.edu.javatpoint.test;


import me.farruhhabibullaev.edu.javatpoint.domain.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

        //Building the session factory

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee();
        employee.setId(124);
        employee.setFirstName("Farruh");
        employee.setLastName("Habibullaev");

        session.persist(employee);

        transaction.commit();

        session.close();

        System.out.println("Automatically successfully saved");
    }
}
