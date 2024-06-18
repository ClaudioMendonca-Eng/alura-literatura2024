package com.alura.literatura2024;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Literatura2024Application implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(Literatura2024Application.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Rodando a aplicação");
	}

}
