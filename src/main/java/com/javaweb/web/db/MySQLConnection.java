package com.javaweb.web.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {
    private static Connection connection;

    public static Connection getConnection() throws Exception {
        if(connection == null){
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_web_db?useSSL=false","root","Wikum@123");
        }
        return connection;
    }
}
