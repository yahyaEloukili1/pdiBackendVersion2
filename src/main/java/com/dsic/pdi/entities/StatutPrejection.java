package com.dsic.pdi.entities;

import javax.persistence.Entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Statut.class)
public interface StatutPrejection {

	public String getStatut();
	public int getId();
	
}
