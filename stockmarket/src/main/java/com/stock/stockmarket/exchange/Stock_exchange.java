package com.stock.stockmarket.exchange;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock_exchange {
	@Id
	private int id;
	private String brief;
	private String remarks;
	private int contact_id;
	public Stock_exchange() {
	}
	public Stock_exchange(int id, String brief, String remarks, int contact_id) {
		super();
		this.id = id;
		this.brief = brief;
		this.remarks = remarks;
		this.contact_id = contact_id;
	}
	public int getId() {
		return this.id;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
