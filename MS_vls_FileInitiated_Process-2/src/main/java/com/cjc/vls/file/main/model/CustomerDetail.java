package com.cjc.vls.file.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class CustomerDetail 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerDetailId;
	private String customerType;
	private String customerUID;
	private String customerSID;
	private String customerDob;
	private String customerEmailid;
	private String customerGender;
	private String customerLocalAddress;
	private String customerMobileno;
	private String customerId;
	private String customerPermanentAddress;
	private String customerTotalFamilyMember;
	private String customerDependentEarningmember;
	private String status;
	public int getCustomerDetailId() {
		return customerDetailId;
	}
	public void setCustomerDetailId(int customerDetailId) {
		this.customerDetailId = customerDetailId;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	public String getCustomerUID() {
	return customerUID;
}
public void setCustomerUID(String customerUID) {
	this.customerUID = customerUID;
}
public String getCustomerSID() {
	return customerSID;
}
public void setCustomerSID(String customerSID) {
	this.customerSID = customerSID;
}
public String getCustomerDob() {
	return customerDob;
}
public void setCustomerDob(String customerDob) {
	this.customerDob = customerDob;
}
public String getCustomerEmailid() {
	return customerEmailid;
}
public void setCustomerEmailid(String customerEmailid) {
	this.customerEmailid = customerEmailid;
}
public String getCustomerGender() {
	return customerGender;
}
public void setCustomerGender(String customerGender) {
	this.customerGender = customerGender;
}
public String getCustomerLocalAddress() {
	return customerLocalAddress;
}
public void setCustomerLocalAddress(String customerLocalAddress) {
	this.customerLocalAddress = customerLocalAddress;
}
public String getCustomerMobileno() {
	return customerMobileno;
}
public void setCustomerMobileno(String customerMobileno) {
	this.customerMobileno = customerMobileno;
}
public String getCustomerId() {
	return customerId;
}
public void setCustomerId(String customerId) {
	this.customerId = customerId;
}
public String getCustomerPermanentAddress() {
	return customerPermanentAddress;
}
public void setCustomerPermanentAddress(String customerPermanentAddress) {
	this.customerPermanentAddress = customerPermanentAddress;
}
public String getCustomerTotalFamilyMember() {
	return customerTotalFamilyMember;
}
public void setCustomerTotalFamilyMember(String customerTotalFamilyMember) {
	this.customerTotalFamilyMember = customerTotalFamilyMember;
}
public String getCustomerDependentEarningmember() {
	return customerDependentEarningmember;
}
public void setCustomerDependentEarningmember(String customerDependentEarningmember) {
	this.customerDependentEarningmember = customerDependentEarningmember;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}



}
