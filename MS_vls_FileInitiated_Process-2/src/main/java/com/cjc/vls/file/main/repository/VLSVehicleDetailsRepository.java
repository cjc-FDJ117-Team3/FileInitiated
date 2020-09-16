package com.cjc.vls.file.main.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.vls.file.main.model.LoanDetails;
import com.cjc.vls.file.main.model.VehicleDetails;


@Repository
public interface VLSVehicleDetailsRepository extends CrudRepository<VehicleDetails , Integer> {

	

	List<VehicleDetails> findByvehicleid(int vehicleid);

	

	

}
