package drivers;

import config.DbConnection;

import java.sql.CallableStatement;
import java.sql.Connection;

public class StoredPrecedure {
    public static void main(String[] args) {
        Connection connection = null;
        CallableStatement myStm = null;
        //Stored procedure is a group of sql statement that performs a particular task
        //Normally created by DBA
        //Created in SQL language supported by native database
        //Can have any combination of input and output parameters

        //To call the stored procedure, the JDBC API provides the callableStatement

        //Increasing the department salary by 5000

        //IN values

        try{
            connection = DbConnection.getConnection();

            String department = "Engineering";
            int increaseAmount = 500;

            myStm = connection.prepareCall("{call increase_salaries_for_department(?,?)}");
            myStm.setString(1,department);
            myStm.setDouble(2,increaseAmount);

            myStm.execute();

            System.out.println("Successful");


        } catch ( Exception e){

        }

    }
}
