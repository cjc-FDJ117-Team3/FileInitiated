package com.cjc.vls.file.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.vls.file.main.model.SanctionLetter;
import com.cjc.vls.file.main.service.VLSServeice;


@CrossOrigin("*")
@RestController
@RequestMapping("/sanctionLetter")
public class SactionLetterController {
		@Autowired
	VLSServeice hs;
	
	@RequestMapping(value="/regSanctionL",method = RequestMethod.POST)
	public List<SanctionLetter> Insertdata(@RequestBody com.cjc.vls.file.main.model.SanctionLetter s)
	{
		
		hs.savedataSanctionLttr(s);
		
		List<SanctionLetter> al=hs.getAllData();
		return al;
	}
	
	@RequestMapping(value="/getdata",method = RequestMethod.GET)
	public List<SanctionLetter> retriveData()
	{
	List<SanctionLetter> al=hs.getAllData();
	return  al;
	
		
	}
	
	@RequestMapping(value="/getdatabyid/{sid}",method = RequestMethod.GET)
	public List<SanctionLetter> retriveDataById(@PathVariable("sactionLetterId") int sactionLetterId)
	{
	List<SanctionLetter> al=hs.getDataBySLId(sactionLetterId);
	return  al;
	
		
	}

}
