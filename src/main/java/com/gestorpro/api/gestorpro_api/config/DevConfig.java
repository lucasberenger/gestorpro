package com.gestorpro.api.gestorpro_api.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("RUNNING ON DEV PROFILE");
    }
}
