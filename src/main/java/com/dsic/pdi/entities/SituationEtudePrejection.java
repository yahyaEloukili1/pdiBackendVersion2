package com.dsic.pdi.entities;

import javax.persistence.Entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = SituationEtude.class)
public interface SituationEtudePrejection {

	public String getSituation();
	public int getId();
	
}
