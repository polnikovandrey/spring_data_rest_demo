package com.mcfly.crud_rest_demo.dao;

import com.mcfly.crud_rest_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members")     // Custom api endpoint name instead of the default generated "employees".
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
