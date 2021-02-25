package com.tbvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class EmployeeServiceTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testFindAllWithLimit() {
        EmployeeService employeeService = context.getBean(EmployeeService.class);

        Assertions.assertEquals(1, employeeService.findAllWithLimit(1).size());
        Assertions.assertEquals(2, employeeService.findAllWithLimit(2).size());
        Assertions.assertEquals(8, employeeService.findAllWithLimit(1500).size());
    }
}
