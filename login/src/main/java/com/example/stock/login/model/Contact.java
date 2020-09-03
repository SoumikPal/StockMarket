package com.example.stock.login.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;  
@Entity    
@Table  
public class Contact {
	@Override
	public String toString() {
		return "Contact [id=" + id + ", city=" + city + ", email=" + email + ", phone=" + phone + ", state=" + state
				+ ", zip=" + zip + ", user=" + user.toString() + "]";
	}
	@Id  
	@Column(name = "id")
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int id;
	@Column
	private String city;
	@Column
	private String email;
	@Column
	private String phone;
	@Column
	private String state;
	@Column
	private String zip;
	
	@OneToOne(mappedBy = "contact",cascade = CascadeType.ALL)
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}

}

