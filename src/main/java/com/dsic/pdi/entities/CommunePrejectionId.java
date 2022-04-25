package com.dsic.pdi.entities;

import javax.persistence.Entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P2", types = Commune.class)
public interface CommunePrejectionId {


	public int getId();
	
}
