package com.tbvn;

import com.tbvn.configuration.WebSecurityConfig;
import com.tbvn.controllers.APIEmployeeController;
import com.tbvn.controllers.MVCEmployeeController;
import com.tbvn.repositories.EmployeeRepository;
import com.tbvn.services.EmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class TechBaseStringApplicationTests {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testBeans() {
        Assertions.assertTrue(context.getBean(EmployeeRepository.class) != null);
        Assertions.assertTrue(context.getBean(EmployeeService.class) != null);
        Assertions.assertTrue(context.getBean(APIEmployeeController.class) != null);
        Assertions.assertTrue(context.getBean(WebSecurityConfig.class) != null);
        Assertions.assertTrue(context.getBean(MVCEmployeeController.class) != null);
    }
}
