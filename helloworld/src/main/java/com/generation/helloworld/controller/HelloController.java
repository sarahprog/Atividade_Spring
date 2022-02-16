package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String getHabilidades () {
		return "Habilidade e mentalidade utilizadas: Orientação ao futuro e Persistência";
	}
	
	@GetMapping("/objetivos")
	public String getHabilidade2 () {
		return "Objetivos de aprendizagem: Adaptabilidade, comunicação e persistência";
	}
}
