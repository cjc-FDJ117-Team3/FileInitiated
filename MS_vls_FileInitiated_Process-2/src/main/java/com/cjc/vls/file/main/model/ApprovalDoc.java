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

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@Entity
public class ApprovalDoc 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int approvedid;
	@OneToOne(cascade = CascadeType.PERSIST)
	private Customer documentid;
    @OneToOne(cascade = CascadeType.PERSIST)
    private CustomerDetail customerDetailId;
    private String remarkbyCM;
    @Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = Shape.STRING,pattern="yyyy-MM-dd")
    private Date remarkdate;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Enquiry enquiryid;
    private String status;
    
       
	public Date getRemarkdate() {
		return remarkdate;
	}
	public void setRemarkdate(Date remarkdate) {
		this.remarkdate = remarkdate;
	}
	public Customer getDocumentid() {
		return documentid;
	}
	public void setDocumentid(Customer documentid) {
		this.documentid = documentid;
	}
	public int getApprovedid() {
		return approvedid;
	}
	public void setApprovedid(int approvedid) {
		this.approvedid = approvedid;
	}
	public CustomerDetail getCustomerDetailId() {
		return customerDetailId;
	}
	public void setCustomerDetailId(CustomerDetail customerDetailId) {
		this.customerDetailId = customerDetailId;
	}
	public String getRemarkbyCM() {
		return remarkbyCM;
	}
	public void setRemarkbyCM(String remarkbyCM) {
		this.remarkbyCM = remarkbyCM;
	}
	
	public Enquiry getEnquiryid() {
		return enquiryid;
	}
	public void setEnquiryid(Enquiry enquiryid) {
		this.enquiryid = enquiryid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
   
}
