package com.mcfly.crud_rest_demo.dao;

import com.mcfly.crud_rest_demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
