package com.project.milestone.stockexchange.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String ceo;
	private String brief;
	private String code;
	private String name;
	private String sectorname;
	private String board;
    
	public String getBoard() {
		return board;
	}

	public void setBoard(String board) {
		this.board = board;
	}

	public Company() {
		
	}
	
	public Company(Long id, String ceo, String brief, String code, String name,String sectorname,String board) {
		super();
		this.id = id;
		this.ceo = ceo;
		this.brief = brief;
		this.code = code;
		this.name = name;
		this.sectorname=sectorname;
		this.board=board;
	}
	
	

	public String getSectorname() {
		return sectorname;
	}

	public void setSectorname(String sectorname) {
		this.sectorname = sectorname;
	}

	public Company(String ceo, String brief, String code, String name) {
		super();
		this.ceo = ceo;
		this.brief = brief;
		this.code = code;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
