package drivers;

import config.DbConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class StoredProcedureOutIn {
    public static void main(String[] args) {
        Connection connection = null;
        CallableStatement callableStatement = null;
        try{

            String department = "Engineering";

            connection = DbConnection.getConnection();
            callableStatement = connection.prepareCall("{call greet_the_department(?)}");

            callableStatement.registerOutParameter(1, Types.VARCHAR);
            callableStatement.setString(1, department);
            callableStatement.execute();

            String value = callableStatement.getString(1);

            System.out.println("Result = : " + value);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
