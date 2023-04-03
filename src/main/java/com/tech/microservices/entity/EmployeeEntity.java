package com.tech.microservices.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class EmployeeEntity {

    @Id
    private Long employeeId;
    private String firstName;
    private String lastName;
    @Email(message = "Email format is incorrect")
    private String email;
    private String department;
}
