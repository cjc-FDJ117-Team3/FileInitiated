package com.cjc.vls.file.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vls_CustomerDetails {
	
	@Id
	private int customerDetailId;
	private String name;
	
	public Vls_CustomerDetails()
	{
		super();
	}

	public Vls_CustomerDetails(int customerDetailId, String name) {
		super();
		this.customerDetailId = customerDetailId;
		this.name = name;
	}

	public int getCustomerDetailId() {
		return customerDetailId;
	}

	public void setCustomerdetailId(int customerDetailId) {
		this.customerDetailId = customerDetailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Vls_CustomerDetails [customerdetailId=" + customerDetailId + ", name=" + name + "]";
	}
	
	
	
}
