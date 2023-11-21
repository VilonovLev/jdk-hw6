package org.example;

import javax.naming.Context;
import java.sql.*;

public class ContextMHP {
    private Connection connection;
    
    private Statement statement;

//    private static void selectAll(String tableName) throws SQLException {
//        try (ResultSet rs = statement.executeQuery("SELECT * FROM " + tableName)) {
//            while (rs.next()) {
//                System.out.println(rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getInt(3));
//            }
//        }
//    }
//
//    private static void incertEx(String tableName, int step, boolean result) throws SQLException {
//        statement.executeUpdate("INSERT INTO students (name, score) VALUES ('Bob', 100);");
//    }
//
//    public static void connect() throws SQLException {
//        try {
//            Class.forName("org.sqlite.JDBC");
//            connection = DriverManager.getConnection("jdbc:sqlite:src/main/main.db");
//            statement = connection.createStatement();
//        } catch (ClassNotFoundException | SQLException e) {
//            throw new SQLException(e.getMessage());
//        }
//    }
//
//    public static void disconnect() {
//        try {
//            statement.close();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            connection.close();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
