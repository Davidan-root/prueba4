package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.demo", "Controllers", "Services", "dto", "Entities", "Repositories"})
public class ParcialMutanteDetectorApplication {

	public static void main(String[] args) {
		SpringApplication.run( ParcialMutanteDetectorApplication.class, args);

		System.out.println("Aplcacion en Funcionamiento");
	}

}
