package cn.rybob.oa.organ.service;

import cn.rybob.oa.organ.model.Employee;

public interface EmployeeService {
    void addEmployee(Employee employee);

    Employee findEmployeeById(int id);
}
