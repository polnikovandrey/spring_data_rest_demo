package com.mcfly.crud_rest_demo.service;

import com.mcfly.crud_rest_demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
}
