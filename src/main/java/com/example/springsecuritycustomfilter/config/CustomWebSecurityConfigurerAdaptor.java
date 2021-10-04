package com.example.springsecuritycustomfilter.config;

import com.example.springsecuritycustomfilter.filter.AuthenticationLoggingFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class CustomWebSecurityConfigurerAdaptor extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic();
        // Add AuthenticationLoggingFilter after BasicAuthenticationFilter 
        http.addFilterAfter(new AuthenticationLoggingFilter(), BasicAuthenticationFilter.class);
        http.authorizeRequests().anyRequest().authenticated();
    }
}
