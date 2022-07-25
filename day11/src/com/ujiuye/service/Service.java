package com.ujiuye.service;

import com.ujiuye.dao.registDao;
import com.ujiuye.entity.User;

public class Service  {
registDao dao = new registDao();
    public int regist(User user) {
       return dao.salveUser(user);
    }
}
