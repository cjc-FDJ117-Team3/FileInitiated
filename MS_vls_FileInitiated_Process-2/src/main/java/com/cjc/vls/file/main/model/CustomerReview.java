package com.cjc.vls.file.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerReview {

	@Id
	private int reviewId;
	private String customerId;
	private String dateReview;
	private String remark;
	private String remarkByCM;
	private String status;
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getDateReview() {
		return dateReview;
	}
	public void setDateReview(String dateReview) {
		this.dateReview = dateReview;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getRemarkByCM() {
		return remarkByCM;
	}
	public void setRemarkByCM(String remarkByCM) {
		this.remarkByCM = remarkByCM;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

	
}
