package com.ujiuye.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.ujiuye.entity.User;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class registDao {
  ComboPooledDataSource dataSource =  new ComboPooledDataSource();
    QueryRunner queryRunner = new QueryRunner(dataSource);
    public int salveUser(User user) {
        String sql = "insert into user values(null,?,?,?,?,?,?)";
        try {
          return   queryRunner.update(sql,user.getUsername(),user.getPassword(),user.getSex(),user.getHobby(),user.getWork(),user.getSdesc());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
