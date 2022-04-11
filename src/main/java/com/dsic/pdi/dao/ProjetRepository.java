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
import com.dsic.pdi.entities.Projet;
import com.dsic.pdi.entities.Province;
import com.dsic.pdi.entities.Statut;

@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface ProjetRepository extends JpaRepository<Projet, Integer> {

	@RestResource(path= "/bProjet")
	public List<Projet> findByProjetContainsIgnoreCase(@Param("mc") String pr);
	
	@RestResource(path= "/byProjetPage")
	public Page<Projet> findByProjetContainsIgnoreCase(@Param("mc") String pr,Pageable peaPageable);
}
