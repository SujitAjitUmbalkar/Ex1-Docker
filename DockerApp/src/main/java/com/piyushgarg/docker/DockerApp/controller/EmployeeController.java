package com.piyushgarg.docker.DockerApp.controller;

import com.piyushgarg.docker.DockerApp.entity.Employee;
import com.piyushgarg.docker.DockerApp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController
{
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> getEmployees()
    {
        return employeeService.getEmployees();
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee)
    {
        return employeeService.createEmployee(employee);
    }

}