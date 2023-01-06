package com.example.spring1st_re;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Spring1stReApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring1stReApplication.class, args);
    }

}
