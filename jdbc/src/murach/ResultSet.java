package murach;

import config.DbConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSet {
    public static void main(String[] args) throws SQLException {
        Connection connection = DbConnection.getConnection();
        java.sql.ResultSet statement = connection.createStatement()
                .executeQuery(" SELECT * FROM User WHERE UserEmail = 'farruh@gmail.com'");
         while (statement.next()){
             System.out.println(statement.getString("UserFirstName"));
         }

    }
}
