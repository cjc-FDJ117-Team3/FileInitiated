package com.cjc.vls.file.main.service;

import java.util.Optional;

import com.cjc.vls.file.main.model.Vls_Guranter_Details;

public interface GuranterDetailsService {
	
	
	public void save(Vls_Guranter_Details gd);
	
	public Iterable<Vls_Guranter_Details> getAlldata();
	

	public void deleteRecord(int guranterId);
	
	public Optional<Vls_Guranter_Details> editRecord(int guranterId);

}
