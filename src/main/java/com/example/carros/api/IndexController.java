package com.example.carros.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
	
	@GetMapping
	public String get() {
		return "get spring boot";
	}
	
	@PostMapping
	public String post() {
		return "post spring boot";
	}
	
	@PutMapping
	public String put() {
		return "put spring boot";
	}
	
	@DeleteMapping
	public String delete() {
		return "delete spring boot";
	}

}
