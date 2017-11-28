package drivers;

import config.DbConnection;

import java.sql.Connection;

public class DatabaseMetaData {
    public static void main(String[] args) {
        //Database Meta data can give information about database
        Connection connection = null;
        java.sql.DatabaseMetaData databaseMetaData = null;
        try{
            connection = DbConnection.getConnection();
            databaseMetaData = connection.getMetaData();

            System.out.println("Information about database\n");
            System.out.println("Product Name : "+ databaseMetaData.getDatabaseProductName());
            System.out.println("Product Version : "+ databaseMetaData.getDatabaseProductVersion());

            System.out.println("Information about driver\n");
            System.out.println("Vendor Driver : " +databaseMetaData.getDriverName());
            System.out.println("Vendor Version : " +databaseMetaData.getDriverVersion());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {

        }
    }

    static void close(Connection connection){

    }
}
