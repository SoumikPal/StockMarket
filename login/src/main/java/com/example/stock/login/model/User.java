package com.example.stock.login.model;
import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity    
@Table
public class User {
	@Override
	public String toString() {
		return "User [id=" + id + ", confirmed=" + confirmed + ", password=" + password + ", userType=" + userType
				+ ", userName=" + userName  + "]";
	}
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	@Column
	private int id;
	@Column
	private int confirmed;
	@Column
	private String password;
	@Column
	private String userType;
	@Column
	private String userName;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id",referencedColumnName = "id")
	private Contact contact;
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(int confirmed) {
		this.confirmed = confirmed;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}

