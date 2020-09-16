package com.cjc.vls.file.main.modeldummy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;


@Entity
public class BranchDetails {

	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
//	@GeneratedValue(
//		    strategy= GenerationType.AUTO,
//		    generator="native"
//		)
//		@GenericGenerator(
//		    name = "native",
//		    strategy = "native"
//		)
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int branchid;
	private String branchname;
	
	public int getBranchid() {
		return branchid;
	}
	public void setBranchid(int branchid) {
		this.branchid = branchid;
	}
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	
	public BranchDetails() {
		
	}
	public BranchDetails(int branchid, String branchname) {
		super();
		this.branchid = branchid;
		this.branchname = branchname;
	}
	
	
	
}
