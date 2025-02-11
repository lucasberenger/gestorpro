package com.gestorpro.api.gestorpro_api.entities;

import com.gestorpro.api.gestorpro_api.entities.enums.Benefit;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class EmployeeBenefitTest {

    @Test
    public void testEmployeeBenefit() {
        Employee mockEmployee = mock(Employee.class);
        EmployeeBenefit employeeBenefit = new EmployeeBenefit(null, mockEmployee, Benefit.FOOD_ALLOWANCE, 100.0);

        assertNotNull(employeeBenefit);
        assertEquals(mockEmployee, employeeBenefit.getEmployee());
        assertEquals(Benefit.FOOD_ALLOWANCE, employeeBenefit.getBenefit());
    }
}
