package com.cjc.vls.file.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.vls.file.main.model.ApprovalDoc;

import com.cjc.vls.file.main.repository.ApproveRepository;
import com.cjc.vls.file.main.service.ApproveService;

@Service
public class ApproveServiceImpl implements ApproveService 
{
	@Autowired
	ApproveRepository ar;
	@Override
	public void saveApproveDoc(ApprovalDoc approve) 
	{
		ar.save(approve);
	}
	@Override
	public List<ApprovalDoc> getApproveDoc() {
		List<ApprovalDoc> list=ar.findAll();
		return list;
	}
	@Override
	public List<ApprovalDoc> getApproveDocById(int approvedid) {
		
		List<ApprovalDoc> list=(List<ApprovalDoc>) ar.findByApprovedid(approvedid);
		return list;
	}
	@Override
	public void deleteApproveDoc(int approvedid) 
	{
		ar.deleteById(approvedid);
		
	}
	
}
