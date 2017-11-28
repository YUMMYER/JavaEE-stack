package drivers;

import config.DbConnection;

import java.sql.Connection;

public class ResultSetMetaData {
    public static void main(String[] args) {
        Connection connection = null;
        java.sql.DatabaseMetaData databaseMetaData = null;

        try {
            connection = DbConnection.getConnection();
            databaseMetaData = connection.getMetaData();
        } catch (Exception e){
            
        }
    }
}
