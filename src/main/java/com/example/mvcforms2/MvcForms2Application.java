package com.example.mvcforms2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MvcForms2Application {

    public static void main(String[] args) {
        SpringApplication.run(MvcForms2Application.class, args);
    }

}
