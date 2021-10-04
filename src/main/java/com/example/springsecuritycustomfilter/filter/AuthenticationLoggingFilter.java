package com.example.springsecuritycustomfilter.filter;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.servlet.*;
import java.io.IOException;

public class AuthenticationLoggingFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication == null){
            System.out.println("Authetication object found null");
            return;
        }
        System.out.println("principle-" + authentication.getName());
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
