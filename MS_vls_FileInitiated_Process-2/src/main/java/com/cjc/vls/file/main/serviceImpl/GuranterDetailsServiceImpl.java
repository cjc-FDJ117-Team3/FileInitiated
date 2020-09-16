package com.cjc.vls.file.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.vls.file.main.repository.GuranterDetailsRepository;
import com.cjc.vls.file.main.model.Vls_Guranter_Details;
import com.cjc.vls.file.main.service.GuranterDetailsService;

@Service
public class GuranterDetailsServiceImpl implements GuranterDetailsService {

	@Autowired
	GuranterDetailsRepository gdr;
	@Override
	public void save(Vls_Guranter_Details gd) {
		gdr.save(gd);
		
	}

	@Override
	public Iterable<Vls_Guranter_Details> getAlldata() {

		Iterable<Vls_Guranter_Details> list=gdr.findAll();
		return list;
	}

	@Override
	public void deleteRecord(int guranterId) {
		gdr.deleteById(guranterId);
		
	}

	@Override
	public Optional<Vls_Guranter_Details> editRecord(int guranterId) {
		Optional<Vls_Guranter_Details> gdl=gdr.findById(guranterId);
		return gdl;
	}

}
