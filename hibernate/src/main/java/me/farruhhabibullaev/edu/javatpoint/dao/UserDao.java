package me.farruhhabibullaev.edu.javatpoint.dao;

import me.farruhhabibullaev.edu.javatpoint.domain.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UserDao {

    public static int register(User user) {
        int i = 0;
        Session session = new Configuration().
                configure().buildSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        transaction.begin();

        i = (int) session.save(user);

        transaction.commit();
        session.close();
        return i;
    }
}
