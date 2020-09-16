package com.cjc.vls.file.main.modeldummy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class DealerDetails {

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
	private int dealerid;
	private String dealername;
	
	public int getDealerid() {
		return dealerid;
	}
	public void setDealerid(int dealerid) {
		this.dealerid = dealerid;
	}
	public String getDealername() {
		return dealername;
	}
	public void setDealername(String dealername) {
		this.dealername = dealername;
	}
	
	public DealerDetails() {
		
	}
	
	public DealerDetails(int dealerid, String dealername) {
		super();
		this.dealerid = dealerid;
		this.dealername = dealername;
	}
	
	
	
}
