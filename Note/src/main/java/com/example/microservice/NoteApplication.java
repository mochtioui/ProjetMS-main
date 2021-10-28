package com.example.microservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class NoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteApplication.class, args);
	}
	
	@Autowired
	private NoteRepository repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save
			repository.save(new Note("math", "ali", "finale"));
			repository.save(new Note("eco", "salah", "modifiable"));
			repository.save(new Note("francais", "sami", "finale"));
			// fetch
			repository.findAll().forEach(System.out::println);
		};
	}

}
