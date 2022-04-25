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
import com.dsic.pdi.entities.SituationEtude;
import com.dsic.pdi.entities.SituationEtudePrejection;
import com.dsic.pdi.entities.SituationEtudePrejectionId;
import com.dsic.pdi.entities.Statut;
import com.dsic.pdi.entities.StatutPrejection;
import com.dsic.pdi.entities.StatutPrejectionId;
import com.dsic.pdi.entities.TauxAvancement;
import com.dsic.pdi.entities.TauxAvancementPrejection;
import com.dsic.pdi.entities.TauxAvancementPrejectionId;

@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface TauxAvancementRepository extends JpaRepository<TauxAvancement, Integer> {

	@RestResource(path= "/byTauxAvancement")
	public List<TauxAvancement> findByTauxAvancementContainsIgnoreCase(@Param("mc") String pr);
	
	@RestResource(path= "/byTauxAvancementPage")
	public Page<TauxAvancement> findByTauxAvancementContainsIgnoreCase(@Param("mc") String pr,Pageable peaPageable);
	public List<TauxAvancementPrejection> findAllByOrderById();
	public List<TauxAvancementPrejectionId> findBy();
}
