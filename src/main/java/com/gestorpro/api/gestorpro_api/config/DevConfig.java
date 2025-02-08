package com.gestorpro.api.gestorpro_api.config;


import com.gestorpro.api.gestorpro_api.entities.Company;
import com.gestorpro.api.gestorpro_api.entities.User;
import com.gestorpro.api.gestorpro_api.repositories.CompanyRepository;
import com.gestorpro.api.gestorpro_api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("RUNNING ON DEV PROFILE");

        User user1 = new User(null, "Maria Brown", "MariaBrown@io.com", "988888888", "123456", null);
        userRepository.save(user1);

        Company comp1 = new Company(null, "Company1", "123456789", user1);
        companyRepository.save(comp1);
        user1.setCompany(comp1);
        userRepository.save(user1);

    }


}
