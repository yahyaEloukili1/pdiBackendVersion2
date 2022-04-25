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
public class Commune {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String commune;
	private String commune_ar;
	
	@ManyToOne()
	 @JoinColumn(name="province_id")
	private Province province;
	
	@OneToMany(mappedBy = "commune",cascade = CascadeType.ALL)
	private List<Projet> projets;

	
	public Commune() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Commune(String commune_fr, String commune_ar, Province province) {
		super();
		this.commune = commune_fr;
		this.commune_ar = commune_ar;
		this.province = province;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getCommune() {
		return commune;
	}


	public void setCommune(String commune) {
		this.commune = commune;
	}


	public String getCommune_ar() {
		return commune_ar;
	}


	public void setCommune_ar(String commune_ar) {
		this.commune_ar = commune_ar;
	}


	public Province getProvince() {
		return province;
	}


	public void setProvince(Province province) {
		this.province = province;
	}


	public List<Projet> getProjets() {
		return projets;
	}


	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}



	
	
}
