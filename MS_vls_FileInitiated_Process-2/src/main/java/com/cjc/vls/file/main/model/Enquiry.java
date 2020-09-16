package com.cjc.vls.file.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Enquiry 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int enquiryid;
	private String loantype;
	private String enquirycreatedby;
    private String customer;
	public int getEnquiryid() {
		return enquiryid;
	}
	public void setEnquiryid(int enquiryid) {
		this.enquiryid = enquiryid;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getEnquirycreatedby() {
		return enquirycreatedby;
	}
	public void setEnquirycreatedby(String enquirycreatedby) {
		this.enquirycreatedby = enquirycreatedby;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
}
