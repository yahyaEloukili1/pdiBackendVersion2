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
import com.dsic.pdi.dao.ProvinceRepository;
import com.dsic.pdi.entities.Commune;
import com.dsic.pdi.entities.Province;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProvinceController {

	@Autowired
	private ProvinceRepository provinceRepository;
	@GetMapping(value = "/provincess")
	public List<Province> listeProvinces(){
		return provinceRepository.findAll();
	}
	@PostMapping(value="/provincess")
	public Province save(@RequestBody Province province) {
		return provinceRepository.save(province);
	}

	@DeleteMapping(value="/provincess/{id}")
	public void delete(@PathVariable(name="id") Integer id) {
		
		 provinceRepository.deleteById(id);
	}
	
	
}
