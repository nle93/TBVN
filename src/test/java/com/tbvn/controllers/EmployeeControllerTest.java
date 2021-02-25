package com.tbvn.controllers;

import com.tbvn.models.Employee;
import com.tbvn.services.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@SpringBootTest
public class EmployeeControllerTest {

    @Mock
    private EmployeeService employeeService;

    @Test
    public void testFindAll() {
        List<Employee> expectedEmployees = new ArrayList<>();
        expectedEmployees.add(new Employee());
        when(employeeService.findAllWithLimit(1500)).thenReturn(expectedEmployees);

        APIEmployeeController employeeController = new APIEmployeeController(employeeService);
        List<Employee> actualEmployee = employeeController.findAll();

        verify(employeeService, times(1)).findAllWithLimit(1500);
        Assertions.assertSame(expectedEmployees, actualEmployee);
    }
}
