package com.dsic.pdi.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dsic.pdi.entities.Commune;
import com.dsic.pdi.entities.CommunePrejection;
import com.dsic.pdi.entities.CommunePrejectionId;
import com.dsic.pdi.entities.Projet;
import com.dsic.pdi.entities.Province;
import com.dsic.pdi.entities.ProvincePrejection;

@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface CommuneRepository extends JpaRepository<Commune, Integer> {

	@RestResource(path= "/byCommune")
	public List<Commune> findByCommuneContainsIgnoreCase(@Param("mc") String pr);
	
	@RestResource(path= "/byCommunePage")
	public Page<Commune> findByCommuneContainsIgnoreCase(@Param("mc") String pr,Pageable peaPageable);
	

	public List<CommunePrejection> findAllByOrderById();
	public List<CommunePrejectionId> findBy();
}
