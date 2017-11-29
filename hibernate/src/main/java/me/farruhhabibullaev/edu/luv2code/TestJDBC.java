package me.farruhhabibullaev.edu.luv2code;

import me.farruhhabibullaev.edu.luv2code.config.DbConfig;
import me.farruhhabibullaev.edu.luv2code.domain.Student;
import org.hibernate.Session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

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

            //Create objects
            Student student = new Student("Nodir", "Habibullaev", "farruhzh@gmail.com");
            Student student1 = new Student("Salim","Jamalob","salim@gmail.com");

            session.beginTransaction();

            session.save(student);
            session.save(student1);

            session.getTransaction().commit();

            //Read objects

            //Get another session

            Session session1 = DbConfig.getSessionFactory().getCurrentSession();
            session1.beginTransaction();
            Student student2 = session1.get(Student.class, student1.getId());
            System.out.println(student2);
            session1.beginTransaction().commit();

            System.out.println("Showing off all the students from the list");

            Session listStudentSession = DbConfig.getSessionFactory().getCurrentSession();
            listStudentSession.beginTransaction();
            //Query the students with HQL
            List<Student> studentList = listStudentSession.createQuery("from Student").list();
            //Display the students
            System.out.println(studentList);

            //
            listStudentSession.getTransaction().commit();

        } finally {

        }
    }
}
