package com.lechitu.demo;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getMySQLConnection() throws SQLException,
            ClassNotFoundException{
        return MySQLConnUtils.getMySQLConnection();
    }

    public static void main(String[] args) throws SQLException,
            ClassNotFoundException{
        System.out.println("Get connection");

        Connection conn = ConnectionUtils.getMySQLConnection();

        System.out.println("Get connection" + conn);
        System.out.println("Done!");
    }
}
