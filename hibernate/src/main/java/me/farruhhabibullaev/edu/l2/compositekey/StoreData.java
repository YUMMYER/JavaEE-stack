package me.farruhhabibullaev.edu.l2.compositekey;

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

        RegistrationId registrationId = new RegistrationId();
        registrationId.setDepartmentId("12");
        registrationId.setStudentId("234");

        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setRegistrationId(registrationId);
        studentEntity.setStudentName("farruh");

        session.persist(studentEntity);
        t.commit();
        session.close();
        System.out.println("success");
    }
}
