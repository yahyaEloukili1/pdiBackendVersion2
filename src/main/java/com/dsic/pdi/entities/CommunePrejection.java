package com.dsic.pdi.entities;

import javax.persistence.Entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Commune.class)
public interface CommunePrejection {

	public String getCommune();
	public int getId();
	
}
