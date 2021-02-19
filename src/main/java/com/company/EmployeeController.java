package com.company;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping("/employee")
    public String showEmployeeHomePage(){
        return "employeeHomePage";
    }

    @RequestMapping("/")
    public String showHomePage(){
        return "welcome";
    }


}
