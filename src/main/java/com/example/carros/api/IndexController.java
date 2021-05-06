package com.example.carros.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String get() {
		return "get spring boot";
	}
	
	@GetMapping("/nomeCompleto/nome/{nome}/sobrenome/{sobrenome}")
	public String nome(@PathVariable("nome") String nome, @PathVariable("sobrenome") String sobrenome) {
		return "Nome:" + nome + " Sobrenome:" + sobrenome;
	}
	
	@GetMapping("/carros/{id}")
	public String getCarroById(@PathVariable("id") Long id) {
		return "Carro by id" + id;
	}
	
	@GetMapping("/carros/tipo/{tipo}")
	public String getCarroByTipo(@PathVariable("tipo") String tipo) {
		return "Lista de carros por tipo " + tipo;
	}
	
}
