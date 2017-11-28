package drivers;

import config.DbConnection;

import java.sql.Connection;
import java.sql.Statement;

public class Update {

    public static void main(String[] args) {
        try{
            Connection connection = DbConnection.getConnection();
            Statement statement = connection.createStatement();

            String sql = "update employee set email = 'nodirbek@gmail.com' where id = '4'";
            statement.executeUpdate(sql);
            System.out.println("Update Successful");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
