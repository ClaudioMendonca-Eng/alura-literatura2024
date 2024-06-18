package com.alura.literatura2024;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alura.literatura2024.principal.Principal;

@SpringBootApplication
public class Literatura2024Application implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(Literatura2024Application.class, args);
	}

	@Override
	public void run(String... args) {
		Principal principal = new Principal();
		principal.exibeMenu();
	}

}
