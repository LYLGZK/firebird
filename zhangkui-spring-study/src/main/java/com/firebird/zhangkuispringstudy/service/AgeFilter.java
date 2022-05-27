package com.firebird.zhangkuispringstudy.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Slf4j
@Component
@WebFilter(urlPatterns = "/filter/age", filterName = "ageFilter", description = "age filter")
public class AgeFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("age filter do ");
        chain.doFilter(request, response);
    }
}
