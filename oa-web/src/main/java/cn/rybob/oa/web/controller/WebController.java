package cn.rybob.oa.web.controller;

import cn.rybob.oa.auth.model.Authorization;
import cn.rybob.oa.auth.service.AuthorizationService;
import cn.rybob.oa.flow.model.Application;
import cn.rybob.oa.flow.service.ApplicationService;
import cn.rybob.oa.organ.model.Employee;
import cn.rybob.oa.organ.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ApplicationService applicationService;
    @Autowired
    private AuthorizationService authorizationService;

    @RequestMapping("/addEmployee")
    @ResponseBody
    public String addEmployee(Employee employee) {
        try {
            employeeService.addEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "ok";
    }

    @RequestMapping("/authorize")
    @ResponseBody
    public String authorize(Authorization authorization) {
        try {
            authorizationService.authorize(authorization);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "ok";
    }

    @RequestMapping("/createApplication")
    @ResponseBody
    public String createApplication(Application application) {
        try {
            applicationService.create(application);
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
        return "ok";
    }
}
