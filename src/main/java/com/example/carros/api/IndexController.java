package com.example.carros.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String get() {
		return "get spring boot";
	}
	
	@GetMapping("/nomeCompleto")
	public String nome(@RequestParam("nome") String nome, @RequestParam("sobrenome") String sobrenome) {
		return "Nome:" + nome + " Sobrenome:" + sobrenome;
	}
	
	
}
