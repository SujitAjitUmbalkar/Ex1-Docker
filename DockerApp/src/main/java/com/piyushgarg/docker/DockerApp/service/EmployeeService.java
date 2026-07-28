package com.piyushgarg.docker.DockerApp.service;


import com.piyushgarg.docker.DockerApp.entity.Employee;

import java.util.List;


public interface EmployeeService {

    Employee createEmployee(Employee employee);

    List<Employee> getEmployees();

}