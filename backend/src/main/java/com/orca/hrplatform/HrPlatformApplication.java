package com.orca.hrplatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class HrPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrPlatformApplication.class, args);
    }
}
