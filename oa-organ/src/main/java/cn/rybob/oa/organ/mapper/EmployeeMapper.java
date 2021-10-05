package cn.rybob.oa.organ.mapper;

import cn.rybob.oa.organ.model.Employee;

public interface EmployeeMapper {
    void addEmployee(Employee employee);

    Employee findEmployeeById(int id);
}
