import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

final public class DbConnection {
    private final static String URL = "jdbc:mysql://localhost:3306/demo?useSSL=false";
    private final static String USER = "root";
    private final static String PASSWORD = "farruh8793";

    private static Connection connection;

    private DbConnection(){

    }

    public static Connection getConnection() {
        if (connection != null) return  connection;
        try {
            connection = DriverManager.getConnection(URL,USER,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
