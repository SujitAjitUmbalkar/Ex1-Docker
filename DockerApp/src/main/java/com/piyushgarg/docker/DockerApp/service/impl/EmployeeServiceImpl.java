package com.piyushgarg.docker.DockerApp.service.impl;

import com.piyushgarg.docker.DockerApp.entity.Employee;
import com.piyushgarg.docker.DockerApp.repository.EmployeeRepository;
import com.piyushgarg.docker.DockerApp.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService
{

    private final EmployeeRepository employeeRepository;


    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {

        this.employeeRepository = employeeRepository;

    }


    @Override
    public Employee createEmployee(Employee employee) {

        return employeeRepository.save(employee);

    }

    @Override
    public List<Employee> getEmployees() {

        return employeeRepository.findAll();

    }

}