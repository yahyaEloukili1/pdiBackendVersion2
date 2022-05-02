package com.dsic.pdi;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.hateoas.config.HypermediaMappingInformation;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.dsic.pdi.dao.AxeRepository;
import com.dsic.pdi.dao.CommuneRepository;
import com.dsic.pdi.dao.MaitreOuvrageRepository;
import com.dsic.pdi.dao.ProjetRepository;
import com.dsic.pdi.dao.ProvinceRepository;
import com.dsic.pdi.dao.SituationEtudeRepository;
import com.dsic.pdi.dao.StatutRepository;
import com.dsic.pdi.dao.TauxAvancementRepository;
import com.dsic.pdi.entities.AppRole;
import com.dsic.pdi.entities.AppUser;
import com.dsic.pdi.entities.Axe;
import com.dsic.pdi.entities.Commune;
import com.dsic.pdi.entities.MaitreOuvrage;
import com.dsic.pdi.entities.Partenaire;
import com.dsic.pdi.entities.Projet;
import com.dsic.pdi.entities.Province;
import com.dsic.pdi.entities.Secteur;
import com.dsic.pdi.entities.SituationEtude;
import com.dsic.pdi.entities.Statut;
import com.dsic.pdi.entities.TauxAvancement;
import com.dsic.pdi.services.AccountService;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class PdiApplication implements CommandLineRunner{
	
	@Autowired
	@Lazy
	private AccountService accountService;
	@Bean
	public BCryptPasswordEncoder getBPE() {
		return new BCryptPasswordEncoder();
	}
	@Autowired
	private CommuneRepository communeRepository;
	@Autowired
	private ProvinceRepository provinceRepository;
	@Autowired
	private MaitreOuvrageRepository maitreOuvrageRepository;
	@Autowired
	private StatutRepository statutRepository;
	@Autowired
	private AxeRepository axeRepository;
	@Autowired
	private ProjetRepository projetRepository;
	@Autowired
	private SituationEtudeRepository situationEtudeRepository;
	@Autowired
	private TauxAvancementRepository tauxAvancementRepository;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(PdiApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Province.class);
		restConfiguration.exposeIdsFor(Secteur.class);
		restConfiguration.exposeIdsFor(Commune.class);
		restConfiguration.exposeIdsFor(MaitreOuvrage.class);
		restConfiguration.exposeIdsFor(Statut.class);
		restConfiguration.exposeIdsFor(Axe.class);
		restConfiguration.exposeIdsFor(Projet.class);
		restConfiguration.exposeIdsFor(Partenaire.class);
		restConfiguration.exposeIdsFor(SituationEtude.class);
		restConfiguration.exposeIdsFor(TauxAvancement.class);
		SituationEtude situationEtude1 = new SituationEtude("En cours de réalisation", "");
		SituationEtude situationEtude2 = new SituationEtude("Achevées", "");
		SituationEtude situationEtude3 = new SituationEtude("Non Lancées", "");
		SituationEtude situationEtude4 = new SituationEtude("Lancées", "");
		SituationEtude situationEtude5 = new SituationEtude("Non concérné", "");
		SituationEtude situationEtude6 = new SituationEtude("-", "");
		List<SituationEtude> s1 = situationEtudeRepository.findBySituationContainsIgnoreCase(situationEtude1.getSituation());
		List<SituationEtude> s2 = situationEtudeRepository.findBySituationContainsIgnoreCase(situationEtude2.getSituation());
		List<SituationEtude> s3 = situationEtudeRepository.findBySituationContainsIgnoreCase(situationEtude3.getSituation());
		List<SituationEtude> s4 = situationEtudeRepository.findBySituationContainsIgnoreCase(situationEtude4.getSituation());
		List<SituationEtude> s5 = situationEtudeRepository.findBySituationContainsIgnoreCase(situationEtude5.getSituation());
		List<SituationEtude> s6 = situationEtudeRepository.findBySituationContainsIgnoreCase(situationEtude6.getSituation());
		if(s1.size()==0) {
			situationEtudeRepository.save(situationEtude1);
		}
		
		if(s2.size()==0) {
			situationEtudeRepository.save(situationEtude2);
		}
		
		if(s3.size()==0) {
			situationEtudeRepository.save(situationEtude3);
		}
		
		if(s4.size()==0) {
			situationEtudeRepository.save(situationEtude4);
		}
	
		if(s5.size()==0) {
			situationEtudeRepository.save(situationEtude5);
		}
		
		if(s6.size()==0) {
			situationEtudeRepository.save(situationEtude6);
		}
		
		TauxAvancement tauxAvancement1 = new TauxAvancement("0%");
		TauxAvancement tauxAvancement2 = new TauxAvancement("Entre 0% 10%");
		TauxAvancement tauxAvancement3 = new TauxAvancement("Entre 11% et 20%");
		TauxAvancement tauxAvancement4 = new TauxAvancement("Entre 21% et 30%");
		TauxAvancement tauxAvancement5 = new TauxAvancement("Entre 31% et 40%");
		TauxAvancement tauxAvancement6 = new TauxAvancement("Entre 41% et 50%");
		TauxAvancement tauxAvancement7 = new TauxAvancement("Entre 51% et 60%");
		TauxAvancement tauxAvancement8 = new TauxAvancement("Entre 61% et 70%");
		TauxAvancement tauxAvancement9 = new TauxAvancement("Entre 71% et 80%");
		TauxAvancement tauxAvancement10 = new TauxAvancement("Entre 81% et 90%");
		TauxAvancement tauxAvancement11 = new TauxAvancement("Entre 91% et 100%");
		TauxAvancement tauxAvancement12 = new TauxAvancement("100%");
		TauxAvancement tauxAvancement13 = new TauxAvancement("-");
		List<TauxAvancement> t1 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement1.getTauxAvancement());
		List<TauxAvancement> t2 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement2.getTauxAvancement());
		List<TauxAvancement> t3 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement3.getTauxAvancement());
		List<TauxAvancement> t4 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement4.getTauxAvancement());
		List<TauxAvancement> t5 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement5.getTauxAvancement());
		List<TauxAvancement> t6 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement6.getTauxAvancement());
		List<TauxAvancement> t7 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement7.getTauxAvancement());
		List<TauxAvancement> t8 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement8.getTauxAvancement());
		List<TauxAvancement> t9 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement9.getTauxAvancement());
		List<TauxAvancement> t10 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement10.getTauxAvancement());
		List<TauxAvancement> t11 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement11.getTauxAvancement());
		List<TauxAvancement> t12 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement12.getTauxAvancement());
		List<TauxAvancement> t13 = tauxAvancementRepository.findByTauxAvancementContainsIgnoreCase(tauxAvancement13.getTauxAvancement());
		
	
		if(t1.size()==0) {
			tauxAvancementRepository.save(tauxAvancement1);
		}
		if(t2.size()==0) {
			tauxAvancementRepository.save(tauxAvancement2);
		}
		if(t3.size()==0) {
			tauxAvancementRepository.save(tauxAvancement3);
		}
		if(t4.size()==0) {
			tauxAvancementRepository.save(tauxAvancement4);
		}
		if(t5.size()==0) {
			tauxAvancementRepository.save(tauxAvancement5);
		}
		if(t6.size()==0) {
			tauxAvancementRepository.save(tauxAvancement6);
		}
		if(t7.size()==0) {
			tauxAvancementRepository.save(tauxAvancement7);
		}
		if(t8.size()==0) {
			tauxAvancementRepository.save(tauxAvancement8);
		}
		if(t9.size()==0) {
			tauxAvancementRepository.save(tauxAvancement9);
		}
		if(t10.size()==0) {
			tauxAvancementRepository.save(tauxAvancement10);
		}
		if(t11.size()==0) {
			tauxAvancementRepository.save(tauxAvancement11);
		}
		if(t12.size()==0) {
			tauxAvancementRepository.save(tauxAvancement12);
		}
		if(t13.size()==0) {
			tauxAvancementRepository.save(tauxAvancement13);
		}
		
		//accountService.save(new AppUser(null,"adminPdi","Laayoune2022@",null,null));
		//accountService.saveRole(new AppRole(null,"ADMIN"));
		//accountService.saveRole(new AppRole(null,"USER"));
		//accountService.addRoleToUser("adminPdi","ADMIN");
		//accountService.addRoleToUser("adminPdi","USER");
		
			
	}

}
