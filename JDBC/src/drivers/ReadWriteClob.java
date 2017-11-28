package drivers;

import config.DbConnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ReadWriteClob {
    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        FileReader fileInputStream = null;

        try{
            connection = DbConnection.getConnection();
            String sql = "update employees set clob_resume = ? where email ='john.doe@foo.com'";
            preparedStatement = connection.prepareStatement(sql);

            File file = new File("Receipt.pdf");
            fileInputStream = new FileReader(file);

            System.out.println("File full path : " + file.getAbsolutePath());
            preparedStatement.setCharacterStream(1,fileInputStream);

            preparedStatement.execute();

            System.out.println("Successfully uploaded");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
