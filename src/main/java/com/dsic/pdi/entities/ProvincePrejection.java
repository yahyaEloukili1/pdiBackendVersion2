package com.dsic.pdi.entities;

import javax.persistence.Entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "P1", types = Province.class)
public interface ProvincePrejection {

	public String getId();
	public String getProvince();

}
