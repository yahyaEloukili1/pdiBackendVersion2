package com.dsic.pdi.dao;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.hateoas.config.HypermediaMappingInformation;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dsic.pdi.entities.Commune;
import com.dsic.pdi.entities.CommunePrejection;
import com.dsic.pdi.entities.CommunePrejectionId;
import com.dsic.pdi.entities.Province;
import com.dsic.pdi.entities.ProvincePrejection;
import com.dsic.pdi.entities.ProvincePrejectionId;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface ProvinceRepository extends JpaRepository<Province, Integer> {

	@RestResource(path= "/byProvince")
	public List<Province> findByProvinceContainsIgnoreCase(@Param("mc") String pr);
	
	@RestResource(path= "/byProvincePage")
	public Page<Province> findByProvinceContainsIgnoreCase(@Param("mc") String pr,Pageable peaPageable);


	public List<ProvincePrejection> findAllByOrderById();
	public List<ProvincePrejectionId> findBy();


}
