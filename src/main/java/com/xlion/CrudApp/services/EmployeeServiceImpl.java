package com.xlion.CrudApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xlion.CrudApp.models.Employee;
import com.xlion.CrudApp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    // Autowired: it allows to create the getter and setter for EmployeeRepository
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
       return employeeRepository.findAll();
    }

    @Override
    public void saveEmployees(Employee employee) {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        }else{
            throw new RuntimeException("Employee not Found for id : " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.employeeRepository.deleteById(id);
    }
    
}
