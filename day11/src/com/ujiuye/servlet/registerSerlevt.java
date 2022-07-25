package com.ujiuye.servlet;

import com.ujiuye.entity.User;
import com.ujiuye.service.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpContext;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/register")
public class registerSerlevt extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String work = req.getParameter("work");
        String sdesc = req.getParameter("sdesc");
        String[] hobbies = req.getParameterValues("hobby");
        User user = new User(username,password,sex, Arrays.toString(hobbies),work,sdesc);
        Service service = new Service();
        int regist = service.regist(user);
        if (regist>0){
            System.out.println("注册成功");
            req.getRequestDispatcher("/html/login.html").forward(req,resp);
        }else {
            System.out.println("注册失败");
        }
    }
}
