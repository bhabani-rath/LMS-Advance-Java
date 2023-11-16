package Dao;

import java.sql.*;

public class DB {

    public static Connection getCon() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn
                    = DriverManager.getConnection("jdbc:mysql://localhost:3306/library",
                            "root", "");

        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
}
