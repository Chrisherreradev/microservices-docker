package com.tech.microservices.repository;

import com.tech.microservices.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
