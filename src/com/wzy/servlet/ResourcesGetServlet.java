package com.wzy.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

@WebServlet(name = "ResourcesGetServlet",urlPatterns = "/ResourcesGetServlet")
public class ResourcesGetServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext =this.getServletContext();
        InputStream resourceAsStream = servletContext.getResourceAsStream("/WEB-INF/classes/resources/itcase.properties");
        Properties properties=new Properties();
        properties.load(resourceAsStream);

        PrintWriter printWriter=response.getWriter();
        printWriter.println("Company = "+properties.getProperty("Company"));
        printWriter.println("Address = "+properties.getProperty("Address"));
        printWriter.println("Single = "+properties.getProperty("SingleName"));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
