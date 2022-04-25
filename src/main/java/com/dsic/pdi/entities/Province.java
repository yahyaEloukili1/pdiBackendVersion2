package com.dsic.pdi.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Province {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String province;
	private String province_ar;
	
	@OneToMany(mappedBy = "province")
	private Collection<Commune> communes;
	

	@OneToMany(mappedBy = "province",cascade = CascadeType.ALL)
	private Collection<Projet> projets;

	public Collection<Commune> getCommunes() {
		return communes;
	}

	public void setCommunes(Collection<Commune> communes) {
		this.communes = communes;
	}

	public Collection<Projet> getProjet() {
		return projets;
	}

	public void setProjet(Collection<Projet> projet) {
		this.projets = projet;
	}



	public Province(String province, String province_ar) {
		super();
		this.province = province;
		this.province_ar = province_ar;
	}

	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getProvince_ar() {
		return province_ar;
	}

	public void setProvince_ar(String province_ar) {
		this.province_ar = province_ar;
	}

	


}
