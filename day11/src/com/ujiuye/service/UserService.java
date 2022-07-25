package com.ujiuye.service;

import com.ujiuye.dao.dao;
import com.ujiuye.entity.User;

public class UserService {
    dao dao = new dao();
    public User login(String username, String password) {
        return dao.userByusernameAndpassword(username, password);

    }
}
