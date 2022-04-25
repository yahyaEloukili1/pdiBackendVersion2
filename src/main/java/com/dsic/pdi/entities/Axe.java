package com.dsic.pdi.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Axe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String axe;
	private String axe_ar;
	@OneToMany(mappedBy = "axe")
	private Collection<Secteur> secteurs;
	
	@OneToMany(mappedBy = "axe")
	private Collection<Projet> projets;
	
	public Axe(String axe, String axe_ar) {
		super();
		this.axe = axe;
		this.axe_ar = axe_ar;
	}
	
	public Axe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAxe() {
		return axe;
	}
	public void setAxe(String axe) {
		this.axe = axe;
	}
	public String getAxe_ar() {
		return axe_ar;
	}
	public void setAxe_ar(String axe_ar) {
		this.axe_ar = axe_ar;
	}

	public Collection<Secteur> getSecteurs() {
		return secteurs;
	}

	public void setSecteurs(Collection<Secteur> secteurs) {
		this.secteurs = secteurs;
	}

	public Collection<Projet> getProjet() {
		return projets;
	}

	public void setProjet(Collection<Projet> projet) {
		this.projets = projet;
	}
	
	
}
