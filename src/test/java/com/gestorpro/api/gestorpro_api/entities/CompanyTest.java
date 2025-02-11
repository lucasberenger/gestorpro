package com.gestorpro.api.gestorpro_api.entities;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
public class CompanyTest {

    @Test
    void TestCompanyCreation() {
        User mockUser = mock(User.class);
        Company company = new Company(null, "Test Company", "21212131", mockUser, null);

        assertNotNull(company);
        assertEquals("Test Company", company.getName());
        assertEquals(mockUser, company.getUser());
    }

}
