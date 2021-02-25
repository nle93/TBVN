package com.tbvn.controllers;

import com.tbvn.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.transaction.Transactional;

@Controller
@RequestMapping("view/employee")
@Transactional
public class MVCEmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    // For UT only
    public MVCEmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/all")
    public String findAll(Model model) {
        model.addAttribute("employees", employeeRepository.findAll());
        return "employee-all";
    }
}
