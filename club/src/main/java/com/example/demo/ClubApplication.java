package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ClubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClubApplication.class, args);
	}
	@Bean
	ApplicationRunner init(ClubRepository repository) {
		return args-> {
			Stream.of("club1","club2","club3").forEach(lbl -> {
				repository.save(new Club(lbl));
			});
			repository.findAll().forEach(System.out::println);
		};
		
		
		
	}

}
