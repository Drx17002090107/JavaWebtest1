package com.wzy.servlet.class11;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        String name=request.getParameter("username");
        String pass=request.getParameter("password");
        response.getWriter().println(session.getAttribute("username"));
        response.getWriter().println(session.getAttribute("password"));
        if(name.equals(session.getAttribute("username"))&&pass.equals(session.getAttribute("password"))){
            response.sendRedirect("index.html");
        }else{
            response.sendRedirect("error.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
