package com.cjc.vls.file.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.cjc.vls.file.main.modeldummy.CustomerDetails;

@Entity
public class SanctionLetter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sactionLetterId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private LoanDetails loandetails;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private VehicleDetails vehiclesdetails;

	public int getSactionLetterId() {
		return sactionLetterId;
	}

	public void setSactionLetterId(int sactionLetterId) {
		this.sactionLetterId = sactionLetterId;
	}

	public LoanDetails getLoandetails() {
		return loandetails;
	}

	public void setLoandetails(LoanDetails loandetails) {
		this.loandetails = loandetails;
	}

	public VehicleDetails getVehiclesdetails() {
		return vehiclesdetails;
	}

	public void setVehiclesdetails(VehicleDetails vehiclesdetails) {
		this.vehiclesdetails = vehiclesdetails;
	}
	
//	private int customerid;
//	private String name;
//	private  String fathername;
//	private String currentaddr;
//	private String make;
//	private String model;
//	private String dealer;
//	private double costofvechile;
//	private double financeamount;
//	private int tenure;
//	private double monthlyemi;
//	private double marginmoney;
//	private double pf;
//	private double advemi;
//	private double secondyear;
//	private double downpayment;
//	private double amountpayablebycjcfinancetodealer;
	
	
		
	
}
