package com.piyushgarg.docker.DockerApp.repository;

import com.piyushgarg.docker.DockerApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository
        extends JpaRepository<Employee, Long> {


}