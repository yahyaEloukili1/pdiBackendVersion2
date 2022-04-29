package com.dsic.pdi.web;

import java.util.Collection;
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

import com.dsic.pdi.dao.AxeRepository;
import com.dsic.pdi.dao.CommuneRepository;
import com.dsic.pdi.dao.ProvinceRepository;
import com.dsic.pdi.dao.SituationEtudeRepository;
import com.dsic.pdi.dao.StatutRepository;
import com.dsic.pdi.dao.TauxAvancementRepository;
import com.dsic.pdi.entities.AxePrejection;
import com.dsic.pdi.entities.Commune;
import com.dsic.pdi.entities.CommunePrejection;
import com.dsic.pdi.entities.CommunePrejectionId;
import com.dsic.pdi.entities.Projet;
import com.dsic.pdi.entities.ProvincePrejection;
import com.dsic.pdi.entities.SituationEtudePrejection;
import com.dsic.pdi.entities.StatutPrejection;
import com.dsic.pdi.entities.TauxAvancement;
import com.dsic.pdi.entities.TauxAvancementPrejection;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CommuneController {

	@Autowired
	private CommuneRepository communeRepository;
	@Autowired
	private ProvinceRepository provinceRepository;
	@Autowired
	private StatutRepository statutRepository;
	@Autowired
	private AxeRepository axeRepository;
	@Autowired
	private SituationEtudeRepository situationEtudeRepository;
	@Autowired
	private TauxAvancementRepository tauxAvancementRepository;
	@GetMapping(value = "/communes1")
	public List<CommunePrejection> listCommunes(){
		
		return communeRepository.findAllByOrderById();
	}
	

	@GetMapping(value = "/provinces1")
	public List<ProvincePrejection> listProvinces(){
		
		return provinceRepository.findAllByOrderById();
	}
	@GetMapping(value = "/statuts1")
	public List<StatutPrejection> listStatut(){
		
		return statutRepository.findAllByOrderById();
	}
	
	@GetMapping(value = "/axes1")
	public List<AxePrejection> listAxe(){
		
		return axeRepository.findAllByOrderById();
	}
	@GetMapping(value = "/situationEtudes1")
	public List<SituationEtudePrejection> listEtudes(){
		
		return situationEtudeRepository.findAllByOrderById();
	}
	@GetMapping(value = "/tauxAvancements1")
	public List<TauxAvancementPrejection> listAvancement(){
		
		return tauxAvancementRepository.findAllByOrderById();
	}
	
	
	@GetMapping(value = "/communes2")
	public List<CommunePrejectionId> listCommuness(){
		return communeRepository.findBy();
	}
	
	
	@GetMapping(value = "/communess/{id}/projets")
	public List<Projet> listProjets(@PathVariable int id){
		Commune c= communeRepository.findById(id).get();
		List<Projet>  projets = c.getProjets();
		return projets;
		
		
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
