package drivers;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import config.DbConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetMetaData {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        java.sql.ResultSetMetaData resultSetMetaData = null;
        ResultSet resultSet = null;

        try {
            connection = DbConnection.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select id,first_name, last_name, salary from employees");
            resultSetMetaData = resultSet.getMetaData();

            System.out.println("Column count : " +resultSetMetaData.getColumnCount());

            for (int column = 1; column <= resultSetMetaData.getColumnCount() ; column++) {
                System.out.println("Column name "+ resultSetMetaData.getColumnName(column));
                System.out.println("Column type name "+ resultSetMetaData.getColumnTypeName(column));
                System.out.println("Is Nullable "+ resultSetMetaData.isNullable(column));
                System.out.println(" Is autoincrement" + resultSetMetaData.isAutoIncrement(column));

            }
        } catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}
