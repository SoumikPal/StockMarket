package com.project.milestone.stockexchange.ipo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ipo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String remarks;
	private double share_price;
	private int total_shares;
	private Long companyid;

	public Ipo() {

	}

	public Ipo(String remarks, double share_price, int total_shares, Long comapny_id) {
		super();
		//this.id = id;
		this.remarks = remarks;
		this.share_price = share_price;
		this.total_shares = total_shares;
		this.companyid = comapny_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public double getShare_price() {
		return share_price;
	}

	public void setShare_price(double share_price) {
		this.share_price = share_price;
	}

	public int getTotal_shares() {
		return total_shares;
	}

	public void setTotal_shares(int total_shares) {
		this.total_shares = total_shares;
	}

	

	public Long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(Long companyid) {
		this.companyid = companyid;
	}

}
