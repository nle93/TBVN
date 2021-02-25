package com.tbvn.controllers;

import com.tbvn.repositories.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.ui.Model;

import static org.mockito.Mockito.*;

@SpringBootTest
public class MVCEmployeeControllerTest {

    @Mock
    private EmployeeRepository employeeRepository;
    @Mock
    private Model model;

    @Test
    public void testFindAll() {
        MVCEmployeeController mvcEmployeeController = new MVCEmployeeController(employeeRepository);
        String result = mvcEmployeeController.findAll(model);

        verify(employeeRepository, times(1)).findAll();
        verify(model, times(1)).addAttribute("employees", employeeRepository.findAll());
        Assertions.assertEquals("employee-all", result);
    }
}
