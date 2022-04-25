package com.dsic.pdi.entities;

import javax.persistence.Entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = TauxAvancement.class)
public interface TauxAvancementPrejection {

	public String getTauxAvancement();
	public int getId();
	
}
