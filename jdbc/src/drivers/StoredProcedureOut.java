package drivers;

import config.DbConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class StoredProcedureOut {
    public static void main(String[] args) {
        Connection connection = null;
        CallableStatement callableStatement = null;

        try{

            connection = DbConnection.getConnection();

            String theString = "Engineering";

            callableStatement = connection.prepareCall("{call get_count_for_department(?,?)}");

            callableStatement.setString(1, theString);
            callableStatement.setInt(2, Types.INTEGER);

            callableStatement.execute();

            int count = callableStatement.getInt(2);
            System.out.println("Department count : "+ count);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
