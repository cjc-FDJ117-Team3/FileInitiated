package com.cjc.vls.file.main.model;


import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Vls_Customer_Pre_Loan_Amount_Details {
	
	@Id
	private int loanamtId;
	private double paidAmount;
	private int tenure;
	private double remainingEMI;
	private double remainingAmount;
	private String bankdetails;
	
	public Vls_Customer_Pre_Loan_Amount_Details()
	{
		super();
	}

	public Vls_Customer_Pre_Loan_Amount_Details(int loanamtId, double paidAmount, int tenure, double remainingEMI,
			double remainingAmount, String bankdetails) {
		super();
		this.loanamtId = loanamtId;
		this.paidAmount = paidAmount;
		this.tenure = tenure;
		this.remainingEMI = remainingEMI;
		this.remainingAmount = remainingAmount;
		this.bankdetails = bankdetails;
	}

	public int getLoanamtId() {
		return loanamtId;
	}

	public void setLoanamtId(int loanamtId) {
		this.loanamtId = loanamtId;
	}

	public double getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public double getRemainingEMI() {
		return remainingEMI;
	}

	public void setRemainingEMI(double remainingEMI) {
		this.remainingEMI = remainingEMI;
	}

	public double getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	public String getBankdetails() {
		return bankdetails;
	}

	public void setBankdetails(String bankdetails) {
		this.bankdetails = bankdetails;
	}

	@Override
	public String toString() {
		return "Vls_Customer_Pre_Loan_Amount_Details [loanamtId=" + loanamtId + ", paidAmount=" + paidAmount
				+ ", tenure=" + tenure + ", remainingEMI=" + remainingEMI + ", remainingAmount=" + remainingAmount
				+ ", bankdetails=" + bankdetails + "]";
	}

	

}
