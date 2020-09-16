package com.cjc.vls.file.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vls_Guranter_Details {
	
	@Id
	private int guranterId;
//	@OneToOne(cascade = CascadeType.ALL)
//	private Vls_CustomerDetails customerDetailId;
	@OneToOne(cascade = CascadeType.PERSIST)
    private CustomerDetail customerDetailId;
	private String firstname;
	private String lastname;
	private String address;
	private String gender;
	private String email;
	private String mobile;
	private String city;
	private String state;
	private int pincode;
	private int bankId;
	private String bankName;
	private String bankAddress;
	private String bankcity;
	private String bankstate;
	private int bankpincode;

	public int getGuranterId() {
		return guranterId;
	}

	public void setGuranterId(int guranterId) {
		this.guranterId = guranterId;
	}
	public CustomerDetail getCustomerDetailId() {
		return customerDetailId;
	}

	public void setCustomerDetailId(CustomerDetail customerDetailId) {
		this.customerDetailId = customerDetailId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getBankId() {
		return bankId;
	}

	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public String getBankcity() {
		return bankcity;
	}

	public void setBankcity(String bankcity) {
		this.bankcity = bankcity;
	}

	public String getBankstate() {
		return bankstate;
	}

	public void setBankstate(String bankstate) {
		this.bankstate = bankstate;
	}

	public int getBankpincode() {
		return bankpincode;
	}

	public void setBankpincode(int bankpincode) {
		this.bankpincode = bankpincode;
	}

	@Override
	public String toString() {
		return "Vls_Guranter_Details [guranterId=" + guranterId + ", customerDetailId=" + customerDetailId
				+ ", firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", gender=" + gender
				+ ", email=" + email + ", mobile=" + mobile + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + ", bankId=" + bankId + ", bankName=" + bankName + ", bankAddress=" + bankAddress
				+ ", bankcity=" + bankcity + ", bankstate=" + bankstate + ", bankpincode=" + bankpincode + "]";
	}
	

}
