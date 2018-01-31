package murach;

import config.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedSt {
    public static void main(String[] args) throws SQLException {
        Connection connection = DbConnection.getConnection();
        String prepareSql = " SELECT * User WHERE UserEmail = ? ";

        PreparedStatement preparedStatement = connection.prepareStatement(prepareSql);
        preparedStatement.setString(1,"farruh@gmail.com");

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()){
            System.out.println(resultSet.getString("idUser"));
        }

    }
}
