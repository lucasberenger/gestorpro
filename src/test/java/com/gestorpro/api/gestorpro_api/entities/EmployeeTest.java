package com.gestorpro.api.gestorpro_api.entities;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class EmployeeTest {

    @Test
    public void testEmployee() {
        Company mockCompany = mock(Company.class);
        Employee employee = new Employee(null, "Test Name", "12345678900", "99999999", "Test Role", 1000.0, mockCompany, null);

        assertNotNull(employee);
        assertEquals("Test Name", employee.getName());
        assertEquals(mockCompany, employee.getCompany());
    }
}
