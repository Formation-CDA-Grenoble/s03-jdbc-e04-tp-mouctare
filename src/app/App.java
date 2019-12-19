package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        ResultSet users = DBManager.sendQuery(
            
        "SELECT * FROM `product` where `brand_id` = 1"
        );
        while (users.next()) {
            System.out.println("User #" + users.getString(1) + ": " + users.getString(3));
        }
    }
}