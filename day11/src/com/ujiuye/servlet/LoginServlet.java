package com.ujiuye.servlet;

import com.ujiuye.entity.User;
import com.ujiuye.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/m1")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username+"\t"+password);
        UserService userService = new UserService();
       User user = userService.login(username,password);
       if (user==null){
           System.out.println("登录失败");
       }else {
           System.out.println("登录成功");
       }

    }
}
