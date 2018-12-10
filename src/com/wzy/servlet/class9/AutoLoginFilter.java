package com.wzy.servlet.class9;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "AutoLoginFilter")
public class AutoLoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)req;
        Cookie[] cookies=request.getCookies();
        String autologin=null;
        for(int i=0;cookies!=null&&i<cookies.length;i++){
            if("autologin".equals(cookies[i].getName())){
                autologin=cookies[i].getValue();
                break;
            }
        }
        if(autologin!=null){
            String[] parts=autologin.split("-");
            String username=parts[0];
            String password=parts[1];
            if("drx".equals(username)&&("123").equals(password)){

            }
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
