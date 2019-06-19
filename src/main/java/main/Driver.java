package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"restapi"})

@SpringBootApplication
public class Driver {
    public static void main(String[] args){
        SpringApplication.run(Driver.class, args);
    }
}
