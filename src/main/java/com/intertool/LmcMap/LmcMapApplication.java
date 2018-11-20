package com.intertool.LmcMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
		"configuration",
		"controller"})
public class LmcMapApplication {

	public static void main(String[] args) {
		SpringApplication.run(LmcMapApplication.class, args);
	}
}
