import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class SQLUtil {

    public static String getHTMLTable(ResultSet resultSet) throws SQLException {
        StringBuilder stringBuilder = new StringBuilder();
        ResultSetMetaData metaData = resultSet.getMetaData();

        int columnCount = metaData.getColumnCount();

        stringBuilder.append("<table>");
        stringBuilder.append("<tr>");

        for (int i = 1; i <= columnCount; i++) {
            stringBuilder.append("<th>");
            stringBuilder.append(metaData.getColumnName(i));
            stringBuilder.append("</th>");
        }
        stringBuilder.append("</tr>");

        while (resultSet.next()) {
            stringBuilder.append("<tr>");

            for (int i = 0; i < columnCount; i++) {
                stringBuilder.append("<td>");
                stringBuilder.append(resultSet.getString(i));
                stringBuilder.append("</td>");
            }
            stringBuilder.append("</tr>");
        }
        stringBuilder.append("</table>");
        return stringBuilder.toString();
    }
}
