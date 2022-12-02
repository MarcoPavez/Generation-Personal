package com.generation.firstproject;

import java.io.Console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.firstproject.models.Mandarina;
import com.generation.firstproject.models.Pera;


@SpringBootApplication
public class FirstprojectApplication {


	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
		Console console = System.console();
		
		Pera pera = new Pera("dulce",10,"verdosa",100f,"lisa","mediana", 50);
		System.out.println(pera);

		Mandarina manda = new Mandarina();

	}

	
}


