package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan("com.example.*")
//@EnableTransactionManagement
public class SpringbootTableThApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTableThApplication.class, args);
	}

}

