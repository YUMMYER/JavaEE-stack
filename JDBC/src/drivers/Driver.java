package drivers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {
    public static void main(String[] args) {
        try{

            // 1. get connection to database
            Connection connection = DriverManager.
                    getConnection("jdbc:mysql://localhost:3306/demo?useSSL=false",
                            "root","farruh8793");
            // 2. Create statement
            Statement  statement = connection.createStatement();
            // 3. Execute SQL Query

            ResultSet resultSet = statement.executeQuery("select * from employee WHERE id = 1");
            // 4. Process the result set

            while (resultSet.next()){
                System.out.println(resultSet.getString("first_name") +", "
                        + resultSet.getString("last_name") +", "
                        + resultSet.getString("email") + ", "
                        + resultSet.getString("id"));
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
