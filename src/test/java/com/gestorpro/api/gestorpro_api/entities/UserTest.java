package com.gestorpro.api.gestorpro_api.entities;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserTest {

    @Test
    void TestUserCreation() {
        Company mockCompany = mock(Company.class);
        User user = new User(null, "Test Name", "Test@io.com", "99999999", "123", mockCompany);

        assertNotNull(user);
        assertEquals("Test Name", user.getName());
        assertEquals(mockCompany, user.getCompany());
    }
}
