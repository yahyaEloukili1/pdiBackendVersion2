package com.dsic.pdi.entities;

import javax.persistence.Entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P2", types = TauxAvancement.class)
public interface TauxAvancementPrejectionId {


	public String getId();

}
