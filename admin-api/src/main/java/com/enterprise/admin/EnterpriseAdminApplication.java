package com.enterprise.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.enterprise.admin")
public class EnterpriseAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterpriseAdminApplication.class, args);
    }
}
