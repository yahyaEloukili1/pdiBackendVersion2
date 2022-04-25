package com.dsic.pdi.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class MaitreOuvrage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String maitreOuvrage;
	private String maitreOuvrage_ar;
	
	@OneToMany(mappedBy = "maitreOuvrage",cascade = CascadeType.ALL)
	private Collection<Projet> projets;
	public MaitreOuvrage(String maitreOuvrage, String maitreOuvrage_ar) {
		super();
		this.maitreOuvrage = maitreOuvrage;
		this.maitreOuvrage_ar = maitreOuvrage_ar;
	}
	public MaitreOuvrage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMaitreOuvrage() {
		return maitreOuvrage;
	}
	public void setMaitreOuvrage(String maitreOuvrage) {
		this.maitreOuvrage = maitreOuvrage;
	}
	public String getMaitreOuvrage_ar() {
		return maitreOuvrage_ar;
	}
	public void setMaitreOuvrage_ar(String maitreOuvrage_ar) {
		this.maitreOuvrage_ar = maitreOuvrage_ar;
	}
	public Collection<Projet> getProjets() {
		return projets;
	}
	public void setProjets(Collection<Projet> projets) {
		this.projets = projets;
	}
	
	
	
	
	
	
}
