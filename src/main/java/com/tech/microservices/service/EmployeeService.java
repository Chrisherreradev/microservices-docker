package com.tech.microservices.service;

import com.tech.microservices.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    String deleteEmployeeById(Long id);
}
