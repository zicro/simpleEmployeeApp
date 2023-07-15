package com.xlion.CrudApp.repository;


import com.xlion.CrudApp.models.Employee;

import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
