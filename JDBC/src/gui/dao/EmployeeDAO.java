package gui.dao;

import config.DbConnection;
import gui.domain.Employee;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class EmployeeDAO {
    private Connection connection;

    public  EmployeeDAO(){
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("JDBC/config.properties"));
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String url = properties.getProperty("dburl");

            //connection = DriverManager.getConnection(url,user,password);
            connection  = DbConnection.getConnection();
            System.out.println("Connected to " + connection);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Employee> getAllEmployee(){
        List<Employee> employees = new ArrayList<>();
        Statement statement = null;

        ResultSet resultSet = null;

        try{
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from employees");


            while (resultSet.next()){
                Employee employee = convertRowToEmployee(resultSet);
                employees.add(employee);
            }

            return employees;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            close(statement,resultSet);
        }

        return null;
    }

    private void close(Statement statement, ResultSet resultSet)  {
        try {
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public List<Employee> searchEmployee(String lastName){
        List<Employee> employeeList = new ArrayList<>();

        PreparedStatement preparedStatement = null;

        ResultSet resultSet = null;

        try{
            lastName +="%";
            preparedStatement =
                    connection.prepareStatement("select * from employees where last_name LIKE ?");
            preparedStatement.setString(1,lastName);

            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Employee employee = convertRowToEmployee(resultSet);
                employeeList.add(employee);
            }

            return employeeList;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(preparedStatement,resultSet);
        }

        return employeeList;
    }

    private Employee convertRowToEmployee(ResultSet resultSet) throws SQLException {
        Employee employee  = new Employee(resultSet.getInt("id"),
                resultSet.getString("first_name"),resultSet.getString("last_name"),
                resultSet.getString("email"),resultSet.getString("department"),
                resultSet.getBigDecimal("salary"));
        return employee;
    }

    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        System.out.println(dao.searchEmployee("thom"));
        System.out.println(dao.getAllEmployee());
    }
}
