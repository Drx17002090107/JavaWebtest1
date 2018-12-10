package com.wzy.servlet.class9;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FilterLoginServlet",urlPatterns = "/FilterLoginServlet")
public class FilterLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String isOK=(String)request.getAttribute("isCheck");
//        response.setContentType("text/html;charset=utf-8");
        if(isOK.equals("ok"))
        response.getWriter().println("接受到的参数为："+username+" "+password+" "+isOK);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
