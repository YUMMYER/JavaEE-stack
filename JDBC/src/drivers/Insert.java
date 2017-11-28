package drivers;

import config.DbConnection;

import java.sql.Connection;
import java.sql.Statement;

public class Insert {

    public static void main(String[] args) {
        try{
            Connection connection = DbConnection.getConnection();
            Statement statement = connection.createStatement();

            String sql = "Insert into employee (first_name, last_name,email) " +
                    "VALUES ('Nodirbek','Habibullaev','nodir@gmail.com')";

            statement.executeUpdate(sql);
            System.out.println("Successfull");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
