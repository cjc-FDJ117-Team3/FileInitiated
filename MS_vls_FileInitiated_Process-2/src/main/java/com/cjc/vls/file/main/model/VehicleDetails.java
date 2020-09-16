package com.cjc.vls.file.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;

import com.cjc.vls.file.main.modeldummy.BranchDetails;
import com.cjc.vls.file.main.modeldummy.DealerDetails;

@Entity
public class VehicleDetails {
	
	//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(
//		    strategy= GenerationType.AUTO,
//		    generator="native"
//		)
//		@GenericGenerator(
//		    name = "native",
//		    strategy = "native"
//		)
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleid ;
	private int vehmodelid;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BranchDetails branchDetails;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private DealerDetails dealerDetails;
	
	private String vehdescription;
	
	
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public int getVehmodelid() {
		return vehmodelid;
	}
	public void setVehmodelid(int vehmodelid) {
		this.vehmodelid = vehmodelid;
	}
	
	
	
	public BranchDetails getBranchDetails() {
		return branchDetails;
	}
	public void setBranchDetails(BranchDetails branchDetails) {
		this.branchDetails = branchDetails;
	}
	public DealerDetails getDealerDetails() {
		return dealerDetails;
	}
	public void setDealerDetails(DealerDetails dealerDetails) {
		this.dealerDetails = dealerDetails;
	}
	public String getVehdescription() {
		return vehdescription;
	}
	public void setVehdescription(String vehdescription) {
		this.vehdescription = vehdescription;
	}
	public VehicleDetails() {
		
	}
	public VehicleDetails(int vehicleid, int vehmodelid, BranchDetails branchDetails, DealerDetails dealerDetails,
			String vehdescription) {
		super();
		this.vehicleid = vehicleid;
		this.vehmodelid = vehmodelid;
		this.branchDetails = branchDetails;
		this.dealerDetails = dealerDetails;
		this.vehdescription = vehdescription;
	}
	
	
	
}
