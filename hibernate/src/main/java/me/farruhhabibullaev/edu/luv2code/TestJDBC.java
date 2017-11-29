package me.farruhhabibullaev.edu.luv2code;

import me.farruhhabibullaev.edu.luv2code.config.DbConfig;
import me.farruhhabibullaev.edu.luv2code.domain.Student;
import org.hibernate.Session;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
        String user = "farruh8793";
        String password = "farruh8793";
        try{
            System.out.println("Connecting to Database");

            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connection successful " + connection);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        Session session = DbConfig.getSessionFactory().getCurrentSession();
        try {

            Student student = new Student("Farruh", "Habibullaev", "farruhzh@gmail.com");

            session.beginTransaction();

            session.save(student);

            session.getTransaction().commit();

        } finally {
            session.close();
        }
    }
}
