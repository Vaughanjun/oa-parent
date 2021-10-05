package cn.rybob.oa.organ.service.impl;

import cn.rybob.oa.organ.mapper.EmployeeMapper;
import cn.rybob.oa.organ.model.Employee;
import cn.rybob.oa.organ.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public void addEmployee(Employee employee) {
        employeeMapper.addEmployee(employee);
    }

    public Employee findEmployeeById(int id){
        return employeeMapper.findEmployeeById(id);
    }
}
