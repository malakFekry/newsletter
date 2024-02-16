package com.newsletter;

// import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
// import java.sql.ResultSet;
import java.sql.SQLException;

public class Connect {
    public static void connect() {
        Connection conn = null;
        try {
            // System.out.println("Connecting to SQLite...");
            // System.out.println(System.getProperty("user.dir"));
            // db parameters
            String url = "jdbc:sqlite:"+System.getProperty("user.dir")+"\\src\\data\\user.db";
            // create a connection to the database
            System.out.println(url);
            conn = DriverManager.getConnection(url);

            // Statement statement = conn.createStatement();
            // ResultSet rs = statement.executeQuery("SELECT * FROM test");
            // while (rs.next()) {
            //     int id = rs.getInt("id");
            //     String name = rs.getString("name");
            //     int age = rs.getInt("age");
            //     String phone = rs.getString("phone");
            //     System.out.println(id + ", " + name + ", " + age +
            //                        ", " + phone);
            // }
            
            // System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
