package com.lechitu.demo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryData {
    public static void main (String[] args) throws ClassNotFoundException, SQLException {
        Connection connection = ConnectionUtils.getMySQLConnection();

        Statement statement = connection.createStatement();

        String sql2 = "Insert into users (id_user, name, age) "
                + " values ('1', 'tu', '25') ";

        statement.executeUpdate(sql2);

        String sql3 = "delete from users where id_user=6";

        statement.executeUpdate(sql3);

        String sql4 = "update users set age = '21' where id_user = 5";

        statement.executeUpdate(sql4);

        String sql1 = "select id_user, name, age from users";

        ResultSet rs = statement.executeQuery(sql1);

        while (rs.next()) {
            int Id = rs.getInt(1);
            String Name = rs.getString(2);
            String Age = rs.getString("age");
            System.out.println("--------------------");
            System.out.println("Id:" + Id);
            System.out.println("Name:" + Name);
            System.out.println("Age:" + Age);
        }

        connection.close();
    }
}
