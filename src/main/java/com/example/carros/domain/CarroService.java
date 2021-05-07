package com.example.carros.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.carros.dto.CarroDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository repository;
	
	public List<CarroDTO> getCarros() {
	//	List<Carro> carros = repository.findAll();
	//	List<CarroDTO> list = carros.stream().map(c -> new CarroDTO(c)).collect(Collectors.toList());

		return repository.findAll().stream().map(CarroDTO::new).collect(Collectors.toList());

	//	List<CarroDTO> list = new ArrayList<>();
	//	for (Carro c : carros) {
	//		list.add(new CarroDTO(c));
	//	}
	//	return list;
	}
	
	public Optional<CarroDTO> getCarroById(Long id) {
		return repository.findById(id).map(CarroDTO::new); //converter option para uma lista

	//	Optional<Carro> carro = repository.findById(id);
	//	if (carro.isPresent()) {
	//		return Optional.of(new CarroDTO(carro.get()));
	//	}else {
	//		return null;
	//	}
	}

	public List<CarroDTO> getCarroByTipo(String tipo) {
		return repository.findByTipo(tipo).stream().map(CarroDTO::new).collect(Collectors.toList());
	}

	public Carro save(Carro carro) {
		return repository.save(carro);
	}

	public void delete(Long id) {
		Optional<CarroDTO> carro = getCarroById(id);
		if(carro.isPresent()) {
			repository.deleteById(id);
		}
		
	}

}
