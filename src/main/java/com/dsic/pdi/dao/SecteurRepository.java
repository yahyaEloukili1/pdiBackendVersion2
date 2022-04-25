package com.dsic.pdi.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dsic.pdi.entities.Axe;
import com.dsic.pdi.entities.Commune;
import com.dsic.pdi.entities.Province;
import com.dsic.pdi.entities.Secteur;
import com.dsic.pdi.entities.Statut;

@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface SecteurRepository extends JpaRepository<Secteur, Integer> {

	@RestResource(path= "/bySecteur")
	public List<Secteur> findBySecteurContainsIgnoreCase(@Param("mc") String pr);
	
	@RestResource(path= "/bySecteurPage")
	public Page<Secteur> findBySecteurContainsIgnoreCase(@Param("mc") String pr,Pageable peaPageable);
}
