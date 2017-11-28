package drivers;

import config.DbConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoredProcedureResultSet {
    public static void main(String[] args) {
        Connection connection = null;
        CallableStatement callableStatement = null;
        ResultSet resultSet = null;
        try {

            String department = "Engineering";

            connection = DbConnection.getConnection();
            callableStatement = connection.prepareCall("{call get_employees_for_department(?)}");

            callableStatement.setString(1,department);
            callableStatement.execute();

             resultSet = callableStatement.getResultSet();

             publish(resultSet);


        } catch (Exception e){

        }
    }

    static void publish(ResultSet resultSet){
        try {
            while (resultSet.next()){
                System.out.println(resultSet.getString("first_name") + " - " + resultSet.getString("department"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
