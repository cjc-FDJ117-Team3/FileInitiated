package com.cjc.vls.file.main.serviceImpl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.vls.file.main.model.Customer;
import com.cjc.vls.file.main.repository.HomeRepository;
import com.cjc.vls.file.main.service.HomeService;

@Service
public class ServiceImpl implements HomeService {

	@Autowired
	HomeRepository hr;
	
	@Override
	public String saveDocumetDetails(MultipartFile[] files) throws IOException 
	{
		// TODO Auto-generated method stub
		Customer cst=new Customer();
		cst.setAdharCard(files[0].getBytes());
		cst.setPanCard(files[0].getBytes());
		cst.setPhoto(files[0].getBytes());
		cst.setSignature(files[0].getBytes());
		cst.setThumb(files[0].getBytes());
		cst.setBankcheck(files[0].getBytes());
		cst.setBankStatement(files[0].getBytes());
		cst.setAddressProof(files[0].getBytes());
		cst.setSalarySleep(files[0].getBytes());	
//		cst.setName(customer);
//		cst.setRemarkbyCM(remark);
		hr.save(cst);
		return "Record Inserted Sucessfully";
	}
	@Override
	public void updateDocumentDetails(MultipartFile[] files) throws IOException {
		// TODO Auto-generated method stub
		Customer cst=new Customer();
		cst.setAdharCard(files[0].getBytes());
		cst.setPanCard(files[0].getBytes());
		cst.setPhoto(files[0].getBytes());
		cst.setSignature(files[0].getBytes());
		cst.setThumb(files[0].getBytes());
		cst.setBankcheck(files[0].getBytes());
		cst.setBankStatement(files[0].getBytes());
		cst.setAddressProof(files[0].getBytes());
		cst.setSalarySleep(files[0].getBytes());	
//		cst.setName(customer);
//		cst.setRemarkbyCM(remark);
		hr.saveAndFlush(cst);
	}
	@Override
	public List<Customer> getDocumentDetails() {
		// TODO Auto-generated method stub
		return hr.findAll();
	}
	@Override
	public void deleteDocumentDetails(int documentid) {
		// TODO Auto-generated method stub
		hr.deleteById(documentid);
	}
	@Override
	public List<Customer> getDocumentDetails(int documentid) {
		// TODO Auto-generated method stub
		return hr.findByDocumentid(documentid);
	}
	
}
