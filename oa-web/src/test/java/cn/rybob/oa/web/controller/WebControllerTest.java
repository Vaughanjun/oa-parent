package cn.rybob.oa.web.controller;

import cn.rybob.oa.auth.model.Authorization;
import cn.rybob.oa.flow.model.Application;
import cn.rybob.oa.organ.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

@ContextConfiguration(locations={"classpath:application-web.xml","classpath:spring-servlet.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class WebControllerTest {

    @Resource
    private WebController webController;

    @Test
    public void testAddEmployee(){
        Employee employee = Employee.builder()
                .name("荆轲")
                .age(14)
                .build();
        String result = webController.addEmployee(employee);
        assertEquals("ok",result);
    }

    @Test
    public void testAuthorize(){
        Authorization authorization = Authorization.builder()
                .employeeId(32L)
                .roleId(32L)
                .build();
        String result = webController.authorize(authorization);
        assertEquals("ok", result);
    }

    @Test
    public void testCreateApplication(){
        Application application = Application.builder()
                .employeeId(30L)
                .days(20L)
                .build();
        String result = webController.createApplication(application);
        assertEquals("ok",result);
    }
}
