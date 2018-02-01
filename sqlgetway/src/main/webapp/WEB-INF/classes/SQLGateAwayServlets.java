import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLGateAwayServlets extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sqlStatement = req.getParameter("sqlStatement");

        String sqlResult = "";

        try {
            Connection connection = DbConnection.getConnection();
            Statement statement = connection.createStatement();
            sqlStatement = sqlStatement.trim();

            if (sqlStatement.length() >= 6) {
                String sqlType = sqlStatement.substring(0, 6);
                if (sqlType.equalsIgnoreCase("select")) {
                    ResultSet resultSet = statement.executeQuery(sqlStatement);
                    sqlResult = SQLUtil.getHTMLTable(resultSet);
                    resultSet.close();
                } else {
                    int i = statement.executeUpdate(sqlStatement);
                    if (i == 0) {
                        sqlResult = "<p>The statement is executed successfully</p>";
                    } else {
                        sqlResult = "<p>The statement is executed successfully<br/></p>" + i + " rows(s) affected";
                    }
                }
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        HttpSession session = req.getSession();
        session.setAttribute("sqlResult", sqlResult);
        session.setAttribute("sqlStatement", sqlStatement);
        String url = "/index.jsp";
        getServletContext().getRequestDispatcher(url).forward(req, resp);
    }
}
