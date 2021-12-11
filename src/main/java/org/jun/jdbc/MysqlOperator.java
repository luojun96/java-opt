package org.jun.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlOperator {
    public void run(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql:/x/127.0.0.1:3306/FaceFashion_MGR","root","Initial0");
            String sql = "insert into user(user_id,user_name,email,phone,user_register_ip) values(?,?,?,?,?)";
            PreparedStatement pStmt = conn.prepareStatement(sql);
            pStmt.setInt(1,2);
            pStmt.setString(2,"luojun02");
            pStmt.setString(3,"luojun96@live.cn");
            pStmt.setString(4,"13626487209");
            pStmt.setInt(5,10898710);
            pStmt.executeUpdate();
            pStmt.close();
            conn.close();
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }

    }
}
