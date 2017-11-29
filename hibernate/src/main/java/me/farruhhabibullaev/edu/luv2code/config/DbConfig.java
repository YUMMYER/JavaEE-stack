package me.farruhhabibullaev.edu.luv2code.config;

import me.farruhhabibullaev.edu.luv2code.domain.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbConfig {

    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory(){
        if (sessionFactory !=null ){
            return sessionFactory;
        }else{
            sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
            return sessionFactory;
        }
    }
}
