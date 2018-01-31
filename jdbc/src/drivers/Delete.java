package drivers;

import config.DbConnection;

import java.sql.Connection;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        try{
            Connection connection = DbConnection.getConnection();
            Statement statement = connection.createStatement();

            String sql = "DELETE FROM employee WHERE id = '4'";
            int effectedRows = statement.executeUpdate(sql);


            System.out.println("Delete successful" + " - Effected rows : "+ effectedRows);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
