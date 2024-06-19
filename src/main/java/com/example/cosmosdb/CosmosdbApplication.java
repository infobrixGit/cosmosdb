package com.example.cosmosdb;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;

@SpringBootApplication
public class CosmosdbApplication  {
	private EmployeeRepository employeeRepository;

	public CosmosdbApplication(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(CosmosdbApplication.class, args);
	}

	@PostConstruct
	void loadData() {
		employeeRepository
				.findAll()
				.subscribe(System.out::println);
	}
}

