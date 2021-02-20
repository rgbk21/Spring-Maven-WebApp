package com.company.interceptors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class EmployeeInterceptor1 extends HandlerInterceptorAdapter {

    public static final Log LOGGER = LogFactory.getLog(EmployeeInterceptor1.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOGGER.info("EmployeeInterceptor1::Request intercepted in preHandle() for URI: " + request.getRequestURI());
        super.preHandle(request, response, handler);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOGGER.info("EmployeeInterceptor1::Request intercepted in postHandle() for URI: " + request.getRequestURI());
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LOGGER.info("EmployeeInterceptor1::Request intercepted in afterCompletion() for URI: " + request.getRequestURI());
        super.afterCompletion(request, response, handler, ex);
    }
}
