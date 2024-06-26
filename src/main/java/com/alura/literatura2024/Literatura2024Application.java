package com.alura.literatura2024;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alura.literatura2024.repository.AutorRepository;
import com.alura.literatura2024.repository.LivroRepository;
import com.alura.literatura2024.principal.Principal;

@SpringBootApplication
public class Literatura2024Application implements CommandLineRunner{
	@Autowired
	AutorRepository autorRepository;
	@Autowired
	LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(Literatura2024Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autorRepository,livroRepository);
		principal.principal();
	}
}
