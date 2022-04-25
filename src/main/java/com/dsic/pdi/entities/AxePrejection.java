package com.dsic.pdi.entities;

import javax.persistence.Entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Axe.class)
public interface AxePrejection {

	public String getAxe();
	public int getId();
	
}
