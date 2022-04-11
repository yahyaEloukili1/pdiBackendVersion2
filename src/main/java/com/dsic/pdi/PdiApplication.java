package com.dsic.pdi;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.dsic.pdi.dao.AxeRepository;
import com.dsic.pdi.dao.CommuneRepository;
import com.dsic.pdi.dao.MaitreOuvrageRepository;
import com.dsic.pdi.dao.ProjetRepository;
import com.dsic.pdi.dao.ProvinceRepository;
import com.dsic.pdi.dao.StatutRepository;
import com.dsic.pdi.entities.Axe;
import com.dsic.pdi.entities.Commune;
import com.dsic.pdi.entities.MaitreOuvrage;
import com.dsic.pdi.entities.Projet;
import com.dsic.pdi.entities.Province;
import com.dsic.pdi.entities.Statut;

@SpringBootApplication
public class PdiApplication implements CommandLineRunner{

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
	private RepositoryRestConfiguration restConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(PdiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		restConfiguration.exposeIdsFor(Province.class);
		restConfiguration.exposeIdsFor(Commune.class);
		restConfiguration.exposeIdsFor(MaitreOuvrage.class);
		restConfiguration.exposeIdsFor(Statut.class);
		restConfiguration.exposeIdsFor(Axe.class);
		restConfiguration.exposeIdsFor(Projet.class);
		
		
		
		
	}

}
