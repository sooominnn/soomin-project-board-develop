package com.soomin.projectboarddevelop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class SoominProjectBoardDevelopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoominProjectBoardDevelopApplication.class, args);
    }

}
