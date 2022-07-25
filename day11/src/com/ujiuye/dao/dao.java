package com.ujiuye.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import com.ujiuye.entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class dao {
    ComboPooledDataSource dataSource = new ComboPooledDataSource();
    QueryRunner qr = new QueryRunner(dataSource);

    public User userByusernameAndpassword(String username, String password) {
        String sql = "select * from user where username=? and password=?";
        try {
           return  qr.query(sql,new BeanHandler<User>(User.class),username,password);

        } catch (SQLException e) {
            e.printStackTrace();
        }
            return null;
    }
}