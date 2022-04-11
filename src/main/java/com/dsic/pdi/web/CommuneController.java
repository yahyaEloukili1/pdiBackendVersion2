package com.dsic.pdi.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsic.pdi.dao.CommuneRepository;
import com.dsic.pdi.entities.Commune;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CommuneController {

	@Autowired
	private CommuneRepository communeRepository;
	@GetMapping(value = "/communess")
	public List<Commune> listCommunes(){
		return communeRepository.findAll();
	}
	@GetMapping(value="/communess/{id}")
	public Commune findCommune(@PathVariable(name="id") Integer id) {
		return communeRepository.findById(id).get();
	}
	@PostMapping(value="/communess")
	public Commune save(@RequestBody Commune commune) {
		return communeRepository.save(commune);
	}
	@PutMapping(value="/communess/{id}")
	public Commune update(@PathVariable(name="id") Integer id,@RequestBody Commune commune) {
		commune.setId(id);
		return communeRepository.save(commune);
	}
	@DeleteMapping(value="/communess/{id}")
	public void delete(@PathVariable(name="id") Integer id) {
		
		 communeRepository.deleteById(id);
	}
	
}
