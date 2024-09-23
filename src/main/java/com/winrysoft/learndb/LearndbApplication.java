package com.winrysoft.learndb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LearndbApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearndbApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(){
		return runner-> {
			System.out.println("Hello World");
		};
	}	

}
