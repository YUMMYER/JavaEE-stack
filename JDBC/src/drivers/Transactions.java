package drivers;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import config.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Transactions {
    public static void main(String[] args) {
        //Transactions are a unit of work

        //one or more SQL statements excuted together
        //Either all of the statements are executed -  Commit
        // Or none of the statements excuted  - Rollback

        //By default the database is set to auto commit, it is need to explicitly turned off
        //connection.setAutoCommit(false);

        //Developers control the commit and rollback
        //conn.commit or conn.rollback

        Connection connection = null;
        Statement statement = null;
        connection = DbConnection.getConnection();

        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            statement.executeUpdate("DELETE FROM employees where department = 'HR'");

            statement.executeUpdate("UPDATE employees set salary = '30000' WHERE department = 'Engineering'");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Do you wanna commit or rollback");
            boolean ok = scanner.nextBoolean();
            if (ok) {
                connection.commit();
                System.out.println("Committed");
            } else {
                connection.rollback();
                System.out.println("Rolled Back");
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
