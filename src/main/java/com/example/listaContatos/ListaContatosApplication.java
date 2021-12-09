package com.example.listaContatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example.listaContatos")
public class ListaContatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaContatosApplication.class, args);
	}

}
