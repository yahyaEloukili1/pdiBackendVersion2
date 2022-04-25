package com.dsic.pdi.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class SituationEtude {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String situation;
	private String situation_ar;
	
	@OneToMany(mappedBy = "situationEtude")
	private Collection<Projet> projets;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public SituationEtude() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SituationEtude(String situation, String situation_ar) {
		super();
		this.situation = situation;
		this.situation_ar = situation_ar;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public String getSituation_ar() {
		return situation_ar;
	}
	public void setSituation_ar(String situation_ar) {
		this.situation_ar = situation_ar;
	}
	public Collection<Projet> getProjets() {
		return projets;
	}
	public void setProjets(Collection<Projet> projets) {
		this.projets = projets;
	}
	
	
}
