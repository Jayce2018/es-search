package com.jayce.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jayce
 */
@SpringBootApplication(scanBasePackages = "com.jayce.es")
public class DemoEsApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoEsApplication.class, args);
    }

}
