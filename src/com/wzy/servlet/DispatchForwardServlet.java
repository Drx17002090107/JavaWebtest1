package com.wzy.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DispatchForwardServlet",urlPatterns = "/DispatchForwardServlet")
public class DispatchForwardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String company = (String) request.getAttribute("company");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("这是一个被请求转发的servlet,DispatchForwardServlet");
        printWriter.print(company);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
