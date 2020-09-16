package com.cjc.vls.file.main.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.vls.file.main.model.Vls_Guranter_Details;
import com.cjc.vls.file.main.serviceImpl.GuranterDetailsServiceImpl;


@CrossOrigin("*")
@RestController
public class GuranterDetailsController {
	
	@Autowired
	GuranterDetailsServiceImpl gdsi;
	

	@PostMapping("/registerg")
	public String SaveLoanDetails(@RequestBody Vls_Guranter_Details gd)
	{
		System.out.println(gd);
		gdsi.save(gd);
		return "inserted successfully";
	}
	
	@GetMapping("/getAllDatag")
	public Iterable< Vls_Guranter_Details> getalldata()
	{
		Iterable< Vls_Guranter_Details> list=gdsi.getAlldata();
		System.out.println(list);
		return list;
	}
	
	@RequestMapping(value="/deleteg/{guranterId}" ,method=RequestMethod.DELETE)
	public void deleteLoanDetails(@PathVariable("guranterId")int guranterId)
	{
		gdsi.deleteRecord(guranterId);
	}
	
	@RequestMapping(value="/editg/{guranteId}" ,method=RequestMethod.GET)
	public Optional<Vls_Guranter_Details> editData(@PathVariable("guranteId")int guranterId)
	{
		Optional<Vls_Guranter_Details> pld=gdsi.editRecord(guranterId);
		return pld;
	}
	
	@RequestMapping(value="/updateg" ,method=RequestMethod.PUT)
	public String updateRecord(@RequestBody Vls_Guranter_Details gd)
	{
		gdsi.save(gd);
		return "updated successfully";
		
	}




}
