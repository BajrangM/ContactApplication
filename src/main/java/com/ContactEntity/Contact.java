package com.ContactEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CONTACT_DTLS")
public class Contact {
	@Id
	@GeneratedValue
	@Column
	private int cid;   
	private String name;
	private String email;
	private long phone;
	private String activeSw;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int cid, String name, String email, long phone, String activeSw) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.activeSw = activeSw;
	}
	@Override
	public String toString() {
		return "Entity [cid=" + cid + ", name=" + name + ", email=" + email + ", phone=" + phone + ", activeSw="
				+ activeSw + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getActiveSw() {
		return activeSw;
	}
	public void setActiveSw(String activeSw) {
		this.activeSw = activeSw;
	}
	
	

}
