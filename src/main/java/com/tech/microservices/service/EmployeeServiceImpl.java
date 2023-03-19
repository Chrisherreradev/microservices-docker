package com.tech.microservices.service;

import com.tech.microservices.exception.EmployeeNotFoundException;
import com.tech.microservices.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    List<Employee> employees = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId()==null || employee.getEmail()==null){
            employee.setEmployeeId(new UUID(0L, 0L).getMostSignificantBits() & Long.MAX_VALUE);
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employees.stream().filter(employee -> employee.getEmployeeId()==id)
                .findFirst()
                .orElseThrow(()->new EmployeeNotFoundException("Employee not found with id " + id));
    }
}
