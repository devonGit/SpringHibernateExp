package com.java.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CorumUser {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String corunuserName;
	@Column
	private String usercity;
	@Column
	private String cntryCode;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCorunuserName() {
		return corunuserName;
	}
	public void setCorunuserName(String corunuserName) {
		this.corunuserName = corunuserName;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}
	public String getCntryCode() {
		return cntryCode;
	}
	public void setCntryCode(String cntryCode) {
		this.cntryCode = cntryCode;
	}
	
	
}
