package com.tbvn.services;

import com.tbvn.models.Employee;
import com.tbvn.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAllWithLimit(int size) {
        Pageable pageable = PageRequest.of(0, size);
        return employeeRepository.findAll(pageable).toList();
    }
}
