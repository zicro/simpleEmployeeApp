package com.xlion.CrudApp.services;

import java.util.List;

import com.xlion.CrudApp.models.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployees(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
