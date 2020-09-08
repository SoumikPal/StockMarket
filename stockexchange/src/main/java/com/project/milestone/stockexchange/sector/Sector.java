package com.project.milestone.stockexchange.sector;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sector {

	@Id
	private Long id;
	private String brief;
	private String name;
	private Long companyId;
	
	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Sector() {
		
	}

	public Sector(Long id, String brief, String name) {
		super();
		this.id = id;
		this.brief = brief;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
