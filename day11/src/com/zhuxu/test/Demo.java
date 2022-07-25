package com.zhuxu.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        Connection con = dataSource.getConnection();
        String sql = "select * from user";
        con.prepareStatement(sql);
        con.createStatement();
    }
}
