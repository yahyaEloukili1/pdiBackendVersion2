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
import com.dsic.pdi.entities.Province;
import com.dsic.pdi.entities.ProvincePrejection;
import com.dsic.pdi.entities.ProvincePrejectionId;
import com.dsic.pdi.entities.Statut;
import com.dsic.pdi.entities.StatutPrejection;
import com.dsic.pdi.entities.StatutPrejectionId;

@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface StatutRepository extends JpaRepository<Statut, Integer> {

	@RestResource(path= "/byStatut")
	public List<Statut> findByStatutContainsIgnoreCase(@Param("mc") String pr);
	
	@RestResource(path= "/byStatutPage")
	public Page<Statut> findByStatutContainsIgnoreCase(@Param("mc") String pr,Pageable peaPageable);
	public List<StatutPrejection> findAllByOrderById();
	public List<StatutPrejectionId> findBy();
}
