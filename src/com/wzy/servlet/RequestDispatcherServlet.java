package com.wzy.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(name = "RequestDispatcherServlet",urlPatterns = "/RequestDispatcherServlet")
public class RequestDispatcherServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setAttribute("company","ＡＭＤ");
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("DispatchForwardServlet");
        requestDispatcher.forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
