package com.aneesh.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String url = System.getenv("JDBC_URL");
        String username = System.getenv("JDBC_USERNAME");
        String password = System.getenv("JDBC_PASSWORD");
        //Scanner sc = new Scanner(System.in);

        try {
            Connection connection =
                    DriverManager.getConnection(url, username, password);

            System.out.println("Connected successfully!");

            String sql = """
                    SELECT * FROM users;
                    """;

            PreparedStatement ps = connection.prepareStatement(sql);
            int rows = 0;
//            for (int i = 0; i < 5; i++) {
//                ps.setString(1, "User00" + i);
//                ps.setString(2, "user00"+i+"@gmail.com");
//
//                rows += ps.executeUpdate();
//            }
//            String name = sc.nextLine();
//            String email = sc.nextLine();
//            ps.setString(1, name);
//            ps.setString(2, email);
//            rows = ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println(id + " " + name + " " + email);

            }
           // System.out.println("Rows inserted: " + rows);
            rs.close();
            ps.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}