package com.java.setterInjection.myFirstProject;

import java.util.List;

public class Customer {
	
	private String name;
	private String mobile;
	private List<String> address;  //we can use the set = list both are same
	private String email;          //we can use the map<String,String> String=key,String=Value
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	
}
