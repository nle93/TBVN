package com.tbvn.controllers;

import com.tbvn.models.Employee;
import com.tbvn.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api/employee")
@Transactional
public class APIEmployeeController {
    @Autowired
    EmployeeService employeeService;

    // For UT only
    public APIEmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all")
    public List<Employee> findAll() {
        return employeeService.findAllWithLimit(1500);
    }
}
