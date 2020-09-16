package com.cjc.vls.file.main.model;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.cjc.vls.file.main.modeldummy.CustomerDetails;
import com.cjc.vls.file.main.modeldummy.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class LoanDetails 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private CustomerDetails customerDetailsId;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private VehicleDetails vehicledetails;
	
	private double totalAmmount;
	private double downpayment;
	private double loanAmount;
	private double rateOfInterest;
	private double totalInterest;
	
	private int tenure;
	private int loanAmountWithIntrest;
	private double advanceEMI;
	
	private double emi;
	
	private double actualEMI;
	private int insurance;
	private double processingFees;
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = Shape.STRING,pattern="yyyy-MM-dd")
	//@JsonFormat(shape = Shape.STRING,pattern="MM/dd/yyy")
	//(pattern="yyyy-MM-dd")
	private Date loanstartdate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = Shape.STRING,pattern="yyyy-MM-dd")
	//@JsonFormat(shape = Shape.STRING,pattern="MM/dd/yyy")
	private Date loanenddate;
	
	private String remark;
	
	@OneToOne(cascade = CascadeType.MERGE)
	private Status status;
	//private int status;
	
	
	
//	public void setStatus(int status) {
//		this.status = status;
//	}
//	public int getStatus() {
//		return status;
//	}
	
	public Date getLoanenddate() {
		return loanenddate;
	}
	public VehicleDetails getVehicledetails() {
		return vehicledetails;
	}
	public void setVehicledetails(VehicleDetails vehicledetails) {
		this.vehicledetails = vehicledetails;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public void setLoanenddate(Date loanenddate) {
		this.loanenddate = loanenddate;
	}
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	
	public CustomerDetails getCustomerDetailsId() {
		return customerDetailsId;
	}
	public void setCustomerDetailsId(CustomerDetails customerDetailsId) {
		this.customerDetailsId = customerDetailsId;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(double totalInterest) {
		this.totalInterest = totalInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getDownpayment() {
		return downpayment;
	}
	public void setDownpayment(double downpayment) {
		this.downpayment = downpayment;
	}
	public double getAdvanceEMI() {
		return advanceEMI;
	}
	public void setAdvanceEMI(double advanceEMI) {
		this.advanceEMI = advanceEMI;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public double getActualEMI() {
		return actualEMI;
	}
	public void setActualEMI(double actualEMI) {
		this.actualEMI = actualEMI;
	}
	public int getInsurance() {
		return insurance;
	}
	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}
	public double getProcessingFees() {
		return processingFees;
	}
	public void setProcessingFees(double processingFees) {
		this.processingFees = processingFees;
	}
	

	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
	public double getTotalAmmount() {
		return totalAmmount;
	}
	
	
	public void setTotalAmmount(double totalAmmount) {
		this.totalAmmount = totalAmmount;
	}
	public int getLoanAmountWithIntrest() {
		return loanAmountWithIntrest;
	}
	public void setLoanAmountWithIntrest(int loanAmountWithIntrest) {
		this.loanAmountWithIntrest = loanAmountWithIntrest;
	}
	public Date getLoanstartdate() {
		return loanstartdate;
	}
	public void setLoanstartdate(Date loanstartdate) {
		this.loanstartdate = loanstartdate;
	}
	
	
	
}
	
