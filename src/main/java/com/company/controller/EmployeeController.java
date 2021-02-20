package com.company.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    public static final Log LOGGER = LogFactory.getLog(EmployeeController.class);

    @RequestMapping("/")
    public String showHomePage(){
        LOGGER.info("EmployeeController::Reached Welcome page");
        return "welcome";
    }

    @RequestMapping("/employee")
    public String showEmployeeHomePage(){
        LOGGER.info("EmployeeController::Reached Employee page");
        return "employeeHomePage";
    }
}
