package drivers;

import config.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatement {

    public static void main(String[] args) {
        Connection connection;
        java.sql.PreparedStatement preparedStatement;
        ResultSet resultSet;

        //1. Set Connection
        connection = DbConnection.getConnection();

        //2. Prepare Statement

        try {
            preparedStatement = connection.prepareStatement("SELECT * FROM employee WHERE department = ? AND salary > ?");

            //3. Set value

            preparedStatement.setDouble(2,1700);
            preparedStatement.setString(1,"Engineer");

            //4 . Execute SQL query

            resultSet = preparedStatement.executeQuery();

            //5. Display data
            display(resultSet);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public  static void display(ResultSet resultSet){
        try {
            while (resultSet.next()){
                System.out.println(resultSet.getString("first_name") + " - " + resultSet.getString("salary") + " -"+resultSet.getString("department"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
