package cn.rybob.service;

import cn.rybob.oa.organ.model.Employee;
import cn.rybob.oa.organ.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:application-organ.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testAddEmployee() {
        employeeService.addEmployee(Employee.builder()
                .name("测试2")
                .age(41)
                .build());
    }
}
