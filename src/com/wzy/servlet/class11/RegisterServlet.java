package com.wzy.servlet.class11;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "RegisterServlet",urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        String name=request.getParameter("username");
        String pass=request.getParameter("password");
        String sex=request.getParameter("sex");
        String age=request.getParameter("age");

            session.setAttribute("username",name);
            session.setAttribute("password",pass);
            request.setAttribute("sex",sex);
            request.setAttribute("age",age);
        response.getWriter().println(session.getAttribute("username"));
        response.getWriter().println(session.getAttribute("password"));
            if(session.getAttribute("username")!=null&&session.getAttribute("password")!=null)
            {
                response.sendRedirect("login.html");
            }else{
                response.sendRedirect("register.html");
            }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
