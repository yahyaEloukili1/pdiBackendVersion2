package com.dsic.pdi.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Province {

	@Id
	@GeneratedValue
	private int id;
	
	private String province;
	private String province_ar;
	
	@OneToMany(mappedBy = "province",cascade = CascadeType.ALL)
	private Collection<Commune> communes;

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
