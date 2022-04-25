package com.dsic.pdi.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.lang.Nullable;



@Entity
public class TauxAvancement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String tauxAvancement;
	
	@OneToMany(mappedBy = "tauxAvancement")
	private Collection<Projet> projets;

	public TauxAvancement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TauxAvancement(String tauxAvancement) {
		super();
		this.tauxAvancement = tauxAvancement;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTauxAvancement() {
		return tauxAvancement;
	}

	public void setTauxAvancement(String tauxAvancement) {
		this.tauxAvancement = tauxAvancement;
	}

	public Collection<Projet> getProjets() {
		return projets;
	}

	public void setProjets(Collection<Projet> projets) {
		this.projets = projets;
	}
	
	
}
