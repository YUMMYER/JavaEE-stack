package drivers;

import config.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;

public class SchemaInfo {

    public static void main(String[] args) {
        Connection connection = null;
        java.sql.DatabaseMetaData databaseMetaData = null;

        String catalog = null;
        String schemaPattern = null;
        String tableNamePattern = null;
        String columnNamePattern = null;
        String [] types = null;
        ResultSet resultSet = null;
        try{
            connection = DbConnection.getConnection();
            databaseMetaData = connection.getMetaData();

            System.out.println("Lists of tables");
            System.out.println("-------------------");
            resultSet = databaseMetaData.getTables(catalog,schemaPattern,tableNamePattern,types);

            while (resultSet.next()){
                System.out.println("Table names : " + resultSet.getString("TABLE_NAME"));
            }

            System.out.println("Lists of Columns");
            resultSet = databaseMetaData.getColumns(catalog,schemaPattern,"employees",columnNamePattern);

            while (resultSet.next()){
                System.out.println(resultSet.getString("COLUMN_NAME"));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
