package com.vtech.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTest1 {

    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDB", "root", "manager");
        System.out.println("Connected to MySQL :" + connection);
    }
}
